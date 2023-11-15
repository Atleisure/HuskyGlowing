package org.siberianhusy.huskyglowing;

import fr.skytasul.glowingentities.GlowingEntities;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.siberianhusy.huskyglowing.commands.Commands;
import org.siberianhusy.huskyglowing.data.Data;
import org.siberianhusy.huskyglowing.events.ChangeModeEvent;
import org.siberianhusy.huskyglowing.events.ExitEvent;
import org.siberianhusy.huskyglowing.events.JoinEvent;
import org.siberianhusy.huskyglowing.events.StartEvent;
import org.siberianhusy.huskyglowing.utils.LoadLang;

import java.util.Objects;

public final class HuskyGlowing extends JavaPlugin {
    public static HuskyGlowing husky;
    public static GlowingEntities glow;
    @Override
    public void onEnable() {
        getLogger().info("HuskyGlowing开始加载中！");
        husky=this;
        //加载发光实体
        glow = new GlowingEntities(this);
        //加载语言配置文件
        LoadLang.loadLang();
        //事件注册
        Bukkit.getPluginManager().registerEvents(new ChangeModeEvent(),this);
        Bukkit.getPluginManager().registerEvents(new ExitEvent(),this);
        Bukkit.getPluginManager().registerEvents(new JoinEvent(),this);
        //如果加载了BattleRoyaleX插件则注册游戏开始监听
        if(Bukkit.getPluginManager().getPlugin("BattleRoyaleX")!=null) {
            Bukkit.getPluginManager().registerEvents(new StartEvent(), this);
        }else {
            Data.isLoadBattleRoyaleX = "§c未启用";
        }
        //指令注册
        Objects.requireNonNull(Bukkit.getPluginCommand("glowing")).setExecutor(new Commands());
        getLogger().info("HuskyGlowing加载完毕！");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        glow.disable();
    }
}
