package me.puppyize.enchantmentextractor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

/**
 * <p>
 * This Minecraft plugin allows a player to extract Enchants from enchanted items through the use of an CraftingTable
 * </p>
 *
 * @author Pawp Flawf <dev@stupid.dog>
 */
class ExtractorListener implements Listener{

	@EventHandler
	public void InventoryClick(PrepareItemCraftEvent e){

        if (e.getInventory().getResult().getType() == Material.ENCHANTED_BOOK) {

            Player p = (Player) e.getInventory().getViewers().iterator().next();
            if(!p.hasPermission("enchantment.extractor.extract")){
                e.getInventory().setResult(null);
                p.sendMessage("You do not have permission to extract Enchantments");
                return;
            }

            ItemStack item = new ItemStack(Material.AIR);
            for (ItemStack itemStack : e.getInventory().getContents()) {
                if (itemStack.getType() != Material.AIR && itemStack.getType() != Material.BOOK) {
                    item = itemStack;
                }
            }

            if (item.getEnchantments().size() < 1) {
                e.getInventory().setResult(null);
            } else {
                Enchantment enchant = item.getEnchantments().keySet().iterator().next();
                int enchantLevel = item.getEnchantmentLevel(enchant);

                ItemStack result = e.getInventory().getResult();

                EnchantmentStorageMeta meta = (EnchantmentStorageMeta) result.getItemMeta();
                meta.addStoredEnchant(enchant,enchantLevel,true);
                result.setItemMeta(meta);

                e.getInventory().setResult(result);

            }
        }
    }

    @EventHandler
    public void InventoryClick(CraftItemEvent e){

        // Check if result is ENCHANTED_BOOK, skip out if not [Fixes #1]
        if(e.getInventory().getResult().getType() != Material.ENCHANTED_BOOK) return;

        Enchantment enchant = ((EnchantmentStorageMeta) e.getInventory().getResult().getItemMeta()).getStoredEnchants().keySet().iterator().next();
	    ItemStack item = new ItemStack(Material.AIR);
	    for (ItemStack itemStack : e.getInventory().getContents()) {
		    if (itemStack.getType() != Material.AIR && itemStack.getType() != Material.BOOK) {
			    item = itemStack;
            }
        }

        Player p = (Player) e.getWhoClicked();
        if(!p.hasPermission("enchantment.extractor.salvage")){
            char[] item_name = item.toString().toCharArray();
            item_name[0] = item.toString().toUpperCase().charAt(0);

            p.sendMessage("You foolishly broke your " + String.valueOf(item_name)  + " while extracting the enchantment");
            return;
        }

        int openInvSpot = p.getInventory().firstEmpty();

        item.removeEnchantment(enchant);
        p.getInventory().setItem(openInvSpot,item);
    }
}
