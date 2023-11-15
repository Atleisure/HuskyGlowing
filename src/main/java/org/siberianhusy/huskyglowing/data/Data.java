package org.siberianhusy.huskyglowing.data;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Data {
    public static final Map<UUID, Player> SPECTATOR_PLAYERS = new HashMap<>();
    public static String isLoadBattleRoyaleX = "§7已加载(游戏开始时旁观者自动可见玩家发光)";
    public static FileConfiguration lang;
}
