package com.snat.chatfilter;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.List;

import static com.snat.chatfilter.Utils.color;

public class ChatListener implements Listener {




    @EventHandler
    public void onChat(AsyncPlayerChatEvent e)  {
        FileConfiguration config = Filter.getPlugin().getConfig();
        Boolean enabled = config.getBoolean("Enabled");

        String message = e.getMessage();
        List<String> line = config.getStringList("Words");
        for (int i = 0; i < line.size(); i++) {
            if (message.contains(line.get(i))) {
                if (enabled == true) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(color(config.getString("Message")));
                }
            }
        }





    }


}
