package winlyps.noTaming

import org.bukkit.plugin.java.JavaPlugin

class NoTaming : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(TamingListener(this), this)
        logger.info("NoTaming plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("NoTaming plugin has been disabled.")
    }
}