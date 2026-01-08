package net.quickesthenry.redstation.RedStationCore2.commands;

import io.papermc.paper.plugin.lifecycle.event.LifecycleEvent;
import io.papermc.paper.plugin.lifecycle.event.LifecycleEventManager;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEventType;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import net.quickesthenry.redstation.RedStationCore2.events.PluginEvents;

public final class PluginCommands {
    private PluginCommands()  {
        throw new UnsupportedOperationException("Utility class");
    }
    public static void register(LifecycleEventManager lifeCycleEventManager) {
        lifeCycleEventManager.registerEventHandler(LifecycleEvents.COMMANDS, PluginCommands::commandRegister);
    }
    public static void commandRegister(LifecycleEvent command) {
        // Register commands here using brigadier api
    }
}
