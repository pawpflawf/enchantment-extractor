package me.puppyize.enchantmentextractor;

import org.bukkit.Material;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.logging.Level;

import static org.bukkit.Material.*;

/**
 * <p>
 * This Minecraft plugin allows a player to extract Enchants from enchanted items through the use of an Anvil
 * </p>
 *
 * @author Pawpy Firelyte <dev@puppyize.me>
 */

public final class EnchantmentExtractor extends JavaPlugin{
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExtractorListener(), this);
        addRecipes();

        try {
            Metrics metrics = new Metrics(this);
            metrics.start();
        } catch (IOException e) {
            getLogger().log(Level.WARNING, "Metrics failed to load");
        }
    }

    public void onDisable() {
        getServer().clearRecipes();
        HandlerList.unregisterAll();
    }

    private void addRecipes(){
        // Applicable Materials for Plugin
        Material[] materials = new Material[]{
                IRON_SPADE,IRON_PICKAXE,IRON_AXE,IRON_HOE,IRON_SWORD,
                WOOD_SPADE,WOOD_PICKAXE,WOOD_AXE,WOOD_HOE,WOOD_SWORD,
                STONE_SPADE,STONE_PICKAXE,STONE_AXE,STONE_HOE,STONE_SWORD,
                DIAMOND_SPADE,DIAMOND_PICKAXE,DIAMOND_AXE,DIAMOND_HOE,DIAMOND_SWORD,
                GOLD_SPADE,GOLD_PICKAXE,GOLD_AXE,GOLD_HOE,GOLD_SWORD,
                FISHING_ROD,SHEARS,BOW,
                LEATHER_HELMET,LEATHER_CHESTPLATE,LEATHER_LEGGINGS,LEATHER_BOOTS,
                CHAINMAIL_HELMET,CHAINMAIL_CHESTPLATE,CHAINMAIL_LEGGINGS,CHAINMAIL_BOOTS,
                IRON_HELMET,IRON_CHESTPLATE,IRON_LEGGINGS,IRON_BOOTS,
                GOLD_HELMET,GOLD_CHESTPLATE,GOLD_LEGGINGS,GOLD_BOOTS,
                DIAMOND_HELMET,DIAMOND_CHESTPLATE,DIAMOND_LEGGINGS,DIAMOND_BOOTS,
        };

        // Create and Add
        for (Material m : materials) {
            ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.ENCHANTED_BOOK)).addIngredient(Material.BOOK).addIngredient(m);
            getServer().addRecipe(recipe);
        }
    }
}
