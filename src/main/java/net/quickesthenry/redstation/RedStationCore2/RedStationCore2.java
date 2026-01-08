package net.quickesthenry.redstation.RedStationCore2;

import net.quickesthenry.redstation.RedStationCore2.commands.PluginCommands;
import net.quickesthenry.redstation.RedStationCore2.events.PluginEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class RedStationCore2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginCommands.register(getLifecycleManager());
        PluginEvents.register(getServer().getPluginManager());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
