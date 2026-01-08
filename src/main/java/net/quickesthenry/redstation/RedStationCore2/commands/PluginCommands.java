package net.quickesthenry.redstation.RedStationCore2.commands;

import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.plugin.lifecycle.event.LifecycleEvent;
import io.papermc.paper.plugin.lifecycle.event.LifecycleEventManager;
import io.papermc.paper.plugin.lifecycle.event.registrar.ReloadableRegistrarEvent;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import net.quickesthenry.redstation.RedStationCore2.RedStationCore2;

public final class PluginCommands {
    private PluginCommands()  {
        throw new UnsupportedOperationException("Utility class");
    }
    public static void register() {
        RedStationCore2.getPlugin(RedStationCore2.class).getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, PluginCommands::commandRegistryEvent);
    }
    public static void commandRegistryEvent(ReloadableRegistrarEvent<Commands> commands) {
        // register commands here
        commands.registrar().register(RulesCommand.buildCommand());
    }
}
