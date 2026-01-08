package net.quickesthenry.redstation.RedStationCore2.events;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RulesCommandMessage implements Listener {
    private final Component message = MiniMessage.miniMessage().deserialize("<gradient:#FF0000:#FFC400>Use the <bold>/rules</bold> Command to see the rules!</gradient>");
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(message);
    }
}
