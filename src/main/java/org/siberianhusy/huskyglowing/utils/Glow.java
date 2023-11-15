package org.siberianhusy.huskyglowing.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.siberianhusy.huskyglowing.HuskyGlowing;
import org.siberianhusy.huskyglowing.data.Data;

import java.util.Map;
import java.util.UUID;

public class Glow {
    /**
     * 给玩家添加发光对旁观者模式的玩家
     * @param player 玩家
     */
    public static void glow(Player player){
        for (Map.Entry<UUID, Player> entry: Data.SPECTATOR_PLAYERS.entrySet()){
            if (player.getGameMode().equals(GameMode.SPECTATOR)){
                try {
                    if (player.getScoreboard().getPlayerTeam(player)!=null) {
                        HuskyGlowing.glow.setGlowing(player, entry.getValue(), player.getScoreboard().getPlayerTeam(player).getColor());
                    }
                    else {
                        HuskyGlowing.glow.setGlowing(player, entry.getValue(), ChatColor.AQUA);
                    }
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void glowing(Player player){
        for (Player player1 : Bukkit.getOnlinePlayers()){
            try {
                HuskyGlowing.glow.setGlowing(player1,player);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void disGlowing(Player player){
        for (Player player1 : Bukkit.getOnlinePlayers()){
            try {
                HuskyGlowing.glow.unsetGlowing(player1,player);
            } catch (ReflectiveOperationException ignored) {
            }
        }
    }

}
