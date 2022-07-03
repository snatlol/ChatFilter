package com.snat.chatfilter;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private static FileConfiguration config;

    public static void setUpConfig(Filter filter) {
        ConfigManager.config = filter.getConfig();
        filter.saveDefaultConfig();
    }



}
