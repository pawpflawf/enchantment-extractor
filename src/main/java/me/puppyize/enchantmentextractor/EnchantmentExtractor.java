package me.puppyize.enchantmentextractor;

import org.bukkit.Material;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.logging.Level;

/**
 * <p>
 * This Minecraft plugin allows a player to extract Enchants from enchanted items through the use of an Anvil
 * </p>
 *
 * @author Pawp Flawf <dev@stupid.dog>
 */

public final class EnchantmentExtractor extends JavaPlugin{
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExtractorListener(), this);
        addRecipes();
    }

    public void onDisable() {
        getServer().clearRecipes();
        HandlerList.unregisterAll();
    }

    private void addRecipes(){
        // Create
        ShapelessRecipe IRON_SPADE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_SPADE);
        ShapelessRecipe IRON_PICKAXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_PICKAXE);
        ShapelessRecipe IRON_AXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_AXE);
        ShapelessRecipe IRON_HOE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_HOE);
        ShapelessRecipe IRON_SWORD = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_SWORD);
        ShapelessRecipe WOOD_SPADE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.WOOD_SPADE);
        ShapelessRecipe WOOD_PICKAXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.WOOD_PICKAXE);
        ShapelessRecipe WOOD_AXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.WOOD_AXE);
        ShapelessRecipe WOOD_HOE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.WOOD_HOE);
        ShapelessRecipe WOOD_SWORD = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.WOOD_SWORD);
        ShapelessRecipe STONE_SPADE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.STONE_SPADE);
        ShapelessRecipe STONE_PICKAXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.STONE_PICKAXE);
        ShapelessRecipe STONE_AXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.STONE_AXE);
        ShapelessRecipe STONE_HOE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.STONE_HOE);
        ShapelessRecipe STONE_SWORD = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.STONE_SWORD);
        ShapelessRecipe DIAMOND_SPADE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_SPADE);
        ShapelessRecipe DIAMOND_PICKAXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_PICKAXE);
        ShapelessRecipe DIAMOND_AXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_AXE);
        ShapelessRecipe DIAMOND_HOE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_HOE);
        ShapelessRecipe DIAMOND_SWORD = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_SWORD);
        ShapelessRecipe GOLD_SPADE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_SPADE);
        ShapelessRecipe GOLD_PICKAXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_PICKAXE);
        ShapelessRecipe GOLD_AXE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_AXE);
        ShapelessRecipe GOLD_HOE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_HOE);
        ShapelessRecipe GOLD_SWORD = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_SWORD);
        ShapelessRecipe FISHING_ROD = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.FISHING_ROD);
        ShapelessRecipe SHEARS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.SHEARS);
        ShapelessRecipe BOW = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.BOW);
        ShapelessRecipe LEATHER_HELMET = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.LEATHER_HELMET);
        ShapelessRecipe LEATHER_CHESTPLATE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.LEATHER_CHESTPLATE);
        ShapelessRecipe LEATHER_LEGGINGS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.LEATHER_LEGGINGS);
        ShapelessRecipe LEATHER_BOOTS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.LEATHER_BOOTS);
        ShapelessRecipe CHAINMAIL_HELMET = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.CHAINMAIL_HELMET);
        ShapelessRecipe CHAINMAIL_CHESTPLATE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.CHAINMAIL_CHESTPLATE);
        ShapelessRecipe CHAINMAIL_LEGGINGS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.CHAINMAIL_LEGGINGS);
        ShapelessRecipe CHAINMAIL_BOOTS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.CHAINMAIL_BOOTS);
        ShapelessRecipe IRON_HELMET = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_HELMET);
        ShapelessRecipe IRON_CHESTPLATE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_CHESTPLATE);
        ShapelessRecipe IRON_LEGGINGS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_LEGGINGS);
        ShapelessRecipe IRON_BOOTS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.IRON_BOOTS);
        ShapelessRecipe GOLD_HELMET = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_HELMET);
        ShapelessRecipe GOLD_CHESTPLATE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_CHESTPLATE);
        ShapelessRecipe GOLD_LEGGINGS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_LEGGINGS);
        ShapelessRecipe GOLD_BOOTS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.GOLD_BOOTS);
        ShapelessRecipe DIAMOND_HELMET = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_HELMET);
        ShapelessRecipe DIAMOND_CHESTPLATE = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_CHESTPLATE);
        ShapelessRecipe DIAMOND_LEGGINGS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_LEGGINGS);
        ShapelessRecipe DIAMOND_BOOTS = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(Material.DIAMOND_BOOTS);

        // Add
        getServer().addRecipe(IRON_SPADE);
        getServer().addRecipe(IRON_PICKAXE);
        getServer().addRecipe(IRON_AXE);
        getServer().addRecipe(IRON_HOE);
        getServer().addRecipe(IRON_SWORD);
        getServer().addRecipe(WOOD_SPADE);
        getServer().addRecipe(WOOD_PICKAXE);
        getServer().addRecipe(WOOD_AXE);
        getServer().addRecipe(WOOD_HOE);
        getServer().addRecipe(WOOD_SWORD);
        getServer().addRecipe(STONE_SPADE);
        getServer().addRecipe(STONE_PICKAXE);
        getServer().addRecipe(STONE_AXE);
        getServer().addRecipe(STONE_HOE);
        getServer().addRecipe(STONE_SWORD);
        getServer().addRecipe(DIAMOND_SPADE);
        getServer().addRecipe(DIAMOND_PICKAXE);
        getServer().addRecipe(DIAMOND_AXE);
        getServer().addRecipe(DIAMOND_HOE);
        getServer().addRecipe(DIAMOND_SWORD);
        getServer().addRecipe(GOLD_SPADE);
        getServer().addRecipe(GOLD_PICKAXE);
        getServer().addRecipe(GOLD_AXE);
        getServer().addRecipe(GOLD_HOE);
        getServer().addRecipe(GOLD_SWORD);
        getServer().addRecipe(FISHING_ROD);
        getServer().addRecipe(SHEARS);
        getServer().addRecipe(BOW);
        getServer().addRecipe(LEATHER_HELMET);
        getServer().addRecipe(LEATHER_CHESTPLATE);
        getServer().addRecipe(LEATHER_LEGGINGS);
        getServer().addRecipe(LEATHER_BOOTS);
        getServer().addRecipe(CHAINMAIL_HELMET);
        getServer().addRecipe(CHAINMAIL_CHESTPLATE);
        getServer().addRecipe(CHAINMAIL_LEGGINGS);
        getServer().addRecipe(CHAINMAIL_BOOTS);
        getServer().addRecipe(IRON_HELMET);
        getServer().addRecipe(IRON_CHESTPLATE);
        getServer().addRecipe(IRON_LEGGINGS);
        getServer().addRecipe(IRON_BOOTS);
        getServer().addRecipe(GOLD_HELMET);
        getServer().addRecipe(GOLD_CHESTPLATE);
        getServer().addRecipe(GOLD_LEGGINGS);
        getServer().addRecipe(GOLD_BOOTS);
        getServer().addRecipe(DIAMOND_HELMET);
        getServer().addRecipe(DIAMOND_CHESTPLATE);
        getServer().addRecipe(DIAMOND_LEGGINGS);
        getServer().addRecipe(DIAMOND_BOOTS);
    }
}
