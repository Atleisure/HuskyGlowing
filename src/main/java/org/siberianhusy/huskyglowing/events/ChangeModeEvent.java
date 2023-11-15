package org.siberianhusy.huskyglowing.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.siberianhusy.huskyglowing.data.Data;

import static org.bukkit.GameMode.SPECTATOR;

public class ChangeModeEvent implements Listener {
    @EventHandler
    public void changeModeEvent(PlayerGameModeChangeEvent event){
        Player player = event.getPlayer();
        if (event.getNewGameMode().equals(SPECTATOR)){
            Data.SPECTATOR_PLAYERS.put(player.getUniqueId(),player);
        }
        else {
            Data.SPECTATOR_PLAYERS.remove(player.getUniqueId());
        }
    }
}
