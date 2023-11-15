package org.siberianhusy.huskyglowing.commands;

import com.sun.nio.sctp.SendFailedNotification;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.siberianhusy.huskyglowing.data.Data;
import org.siberianhusy.huskyglowing.utils.Glow;
import org.siberianhusy.huskyglowing.utils.SendMessage;

import javax.swing.plaf.basic.BasicButtonUI;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender.hasPermission("huskyglowing.admin")){
            if (args.length==1&&args[0].equalsIgnoreCase("0")){
                for (Player player: Bukkit.getOnlinePlayers()){
                    Glow.glow(player);
                }
                SendMessage.sendMsg("glow.command0",sender);
                return true;
            }
            if (sender instanceof Player){
                if (args.length==1&&args[0].equalsIgnoreCase("1")){
                    Glow.glowing((Player) sender);
                    SendMessage.sendMsg("glow.command1",sender);
                    return true;
                }
                else if (args.length==1&&args[0].equalsIgnoreCase("disglow")){
                    Glow.disGlowing((Player) sender);
                    SendMessage.sendMsg("glow.disGlow",sender);
                    return true;
                }
            }
            if (args.length==1&&args[0].equalsIgnoreCase("plugins")){
                sender.sendMessage("§eBattleRoyaleX: "+ Data.isLoadBattleRoyaleX);
                return true;
            }
            SendMessage.sendMsgList("help",sender);
        }
        return false;
    }
}
