package org.siberianhusy.huskyglowing.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import org.siberianhusy.huskyglowing.HuskyGlowing;
import org.siberianhusy.huskyglowing.data.Data;

import java.io.File;

public class LoadLang {
    public static void loadLang(){
        HuskyGlowing.husky.saveResource("lang/lang.yml",false);
        File file = new File(HuskyGlowing.husky.getDataFolder(), "lang/lang.yml");
        Data.lang = YamlConfiguration.loadConfiguration(file);
    }
}
