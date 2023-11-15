package org.siberianhusy.huskyglowing.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.siberianhusy.huskyglowing.data.Data;

import java.util.List;

public class SendMessage {
    public static void sendMessage(String text, CommandSender sender){
        sender.sendMessage(Replace.replaceColor(text));
    }
    public static void sendMessage(List<String> text,CommandSender sender){
        for (String msg : text){
            sender.sendMessage(Replace.replaceColor(msg));
        }
    }
    public static void sendMsg(String langKey,CommandSender sender){
        sendMessage(Data.lang.getString(langKey),sender);
    }
    public static void sendMsgList(String langKey,CommandSender sender){
        sendMessage(Data.lang.getStringList(langKey),sender);
    }
}
