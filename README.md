# Enchantment Extractor #
## Latest: 1.2.1 - Spigot 1.11.2 ##

**EnchantmentExtractor** opens the ability for Players to salvage their enchantments and create the ultimate enchanted item! Using a standard crafting bench, Players can combine any enchanted item with a blank book to salvage / extract 1 of the enchantments from the item! The extraction puts the exact enchantment into the book for later use, leaving the other enchantments available for usage (or extraction themselves)! 

**EnchantmentExtractor** takes advantage of MCStats for plugin statistical purposes. Statistical information retrieved from this tool is exclusively used by the developer to understand how the plugin is implemented and used 'in the wild' (a.k.a. production). Easy opt-out instructions are defined below! :D  

-----

## Permissions ##
- `enchantment.extractor.extract`: Allows usage of EnchantmentExtractor
- `enchantment.extractor.salvage`: Saves enchanted item (minus extracted enchantment) back to inventory

-----

### MCStats / Metrics ###

**Disabling Metrics**
The file ../plugins/Plugin Metrics/config.yml contains an option to opt-out  

The following data is **read** from the server in some way or another  

- File Contents of plugins/Plugin Metrics/config.yml (created if not existent)
- Players currently online (not max player count)
- Server version string (the same version string you see in /version)
- Plugin version of the metrics-supported plugin

The following data is **sent** to http://mcstats.org and can be seen under [http://mcstats.org/plugin/EnchantmentExtractor](http://mcstats.org/plugin/EnchantmentExtractor 'MCStats Page')

- Metrics revision of the implementing class
- Server's GUID
- Players currently online (not max player count)
- Server version string (the same version string you see in /version)
- Plugin version of the metrics-supported plugin

-----

### External Links ###
- [MCStats](http://mcstats.org/plugin/EnchantmentExtractor 'MCStats Details')
- [Spigot](http://www.spigotmc.org/resources/enchantmentextractor.7198/ 'Spigot Project Page')
- [GitHub Repo](https://github.com/puppyize/EnchantmentExtractor 'The Repository')

-----

_**Developer Note**_: If you feel the plugin is missing something or can benefit with something already existing acting differently, I want to hear about it! You can submit an [Issue](https://github.com/puppyize/EnchantmentExtractor/issues/new) here at GitHub, or you can comment / PM on any one of our external resource sites! You could even send an email to <dev@puppyize.me> with the subject "Enchantment Extractor Suggestion" and I'll look into it! 

####PLEASE REPORT ALL BUGS####