package net.quickesthenry.redstation.RedStationCore2.events;

import net.quickesthenry.redstation.RedStationCore2.RedStationCore2;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public final class PluginEvents {
    private PluginEvents() {
        throw new UnsupportedOperationException("Utility class");
    }
    public static void register(PluginManager pluginManager) {
        // register events here using pluginManager.registerEvents()
        Plugin plugin = RedStationCore2.getPlugin(RedStationCore2.class);
        pluginManager.registerEvents(new RulesCommandMessage(), plugin);
    }
}
