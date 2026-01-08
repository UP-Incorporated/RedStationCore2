package net.quickesthenry.redstation.RedStationCore2.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandException;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public final class RulesCommand {
    private RulesCommand() {
        throw new UnsupportedOperationException("Utility class");
    }
    private static final MiniMessage mm = MiniMessage.miniMessage();
    public static LiteralCommandNode<CommandSourceStack> buildCommand() {
        LiteralCommandNode<CommandSourceStack> command = Commands.literal("rules").executes(RulesCommand::onExecute).build();
        return command;
    }
    public static int onExecute(CommandContext<CommandSourceStack> ctx) {
        if (ctx.getSource().getSender() != ctx.getSource().getExecutor()) return 0;
        if (ctx.getSource().getSender() instanceof Player) {
            Player sender = (Player) ctx.getSource().getSender();
            String rulesMessage =
                    "<gold><bold>Server Rules</bold></gold><newline>" +
                            "<gray>──────────────</gray><newline>" +
                            "<yellow>1.</yellow> <white>No hacking, cheating, or exploits</white><newline>" +
                            "<yellow>2.</yellow> <white>Be respectful to all players</white><newline>" +
                            "<yellow>3.</yellow> <white>No spam or advertising</white><newline>" +
                            "<yellow>4.</yellow> <white>Follow staff instructions</white><newline>" +
                            "<gray>──────────────</gray><newline>" +
                            "<green>Have fun and play fair!</green>";

            Component component = mm.deserialize(rulesMessage);
            sender.sendMessage(component);
            return 1;
        }
        return 0;
    }
}
