package me.puppyize.enchantmentextractor;

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
 * This Minecraft plugin allows a player to extract Enchants from enchanted items through the use of an Anvil
 * </p>
 *
 * @author Puppy Firelyte <dev@puppyize.me>
 */
class ExtractorListener implements Listener{

	@EventHandler
	public void InventoryClick(PrepareItemCraftEvent e){

		if (e.getInventory().getResult().getType() == Material.ENCHANTED_BOOK) {

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

	    Enchantment enchant = ((EnchantmentStorageMeta) e.getInventory().getResult().getItemMeta()).getStoredEnchants().keySet().iterator().next();
	    ItemStack item = new ItemStack(Material.AIR);
	    for (ItemStack itemStack : e.getInventory().getContents()) {
		    if (itemStack.getType() != Material.AIR && itemStack.getType() != Material.BOOK) {
			    item = itemStack;
            }
        }

        Player p = (Player) e.getWhoClicked();
        int openInvSpot = p.getInventory().firstEmpty();

        item.removeEnchantment(enchant);
        p.getInventory().setItem(openInvSpot,item);
    }

}
