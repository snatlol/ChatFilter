package com.snat.chatfilter;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Filter extends JavaPlugin {



    public static Plugin getPlugin() {
        return plugin;
    }

    private static Filter plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        ConfigManager.setUpConfig(this);


    }


    
}
