package winlyps.noTaming

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityTameEvent
import org.bukkit.plugin.Plugin

class TamingListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onEntityTame(event: EntityTameEvent) {
        // Cancel the taming event
        event.isCancelled = true
    }
}