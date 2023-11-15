package org.siberianhusy.huskyglowing.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.siberianhusy.huskyglowing.data.Data;

public class ExitEvent implements Listener {
    @EventHandler
    public void exitEvent(PlayerQuitEvent event){
        Player player = event.getPlayer();
        Data.SPECTATOR_PLAYERS.remove(player.getUniqueId());
    }
}
