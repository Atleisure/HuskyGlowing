package org.siberianhusy.huskyglowing.events;

import me.wazup.battleroyalex.events.BRArenaStartEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.siberianhusy.huskyglowing.HuskyGlowing;
import org.siberianhusy.huskyglowing.data.Data;
import org.siberianhusy.huskyglowing.utils.Glow;
import org.w3c.dom.events.Event;

import java.util.Map;
import java.util.UUID;

public class StartEvent implements Listener {
    @EventHandler
    public void startGame(BRArenaStartEvent event){
        for (Player player:event.getPlayers()){
            Glow.glow(player);
        }
    }
}
