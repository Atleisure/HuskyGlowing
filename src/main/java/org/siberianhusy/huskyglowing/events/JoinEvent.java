package org.siberianhusy.huskyglowing.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.siberianhusy.huskyglowing.data.Data;

import static org.bukkit.GameMode.SPECTATOR;

public class JoinEvent implements Listener {
    @EventHandler
    public void joinEvent(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if (player.getGameMode().equals(SPECTATOR)){
            Data.SPECTATOR_PLAYERS.put(player.getUniqueId(),player);
        }
    }

}
