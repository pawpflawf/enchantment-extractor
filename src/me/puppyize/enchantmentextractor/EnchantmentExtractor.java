package me.puppyize.enchantmentextractor;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.logging.Level;

/**
 * <p>
 * This Minecraft plugin allows a player to extract Enchants from enchanted items through the use of an Anvil
 * </p>
 *
 * @author Puppy Firelyte <dev@puppyize.me>
 */

public final class EnchantmentExtractor extends JavaPlugin{
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExtractorListener(), this);

        // Register Metrics
        try {
            Metrics metrics = new Metrics(this);
            metrics.start();
        } catch (IOException e) {
            getLogger().log(Level.WARNING, "Metrics failed to load");
        }
    }

    public void onDisable() {
       // Unregister Event Handler
        HandlerList.unregisterAll();
    }

}
