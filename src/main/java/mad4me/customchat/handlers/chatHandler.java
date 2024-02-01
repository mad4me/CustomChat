package mad4me.customchat.handlers;

import mad4me.customchat.CustomChat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatHandler implements Listener {

    public chatHandler(CustomChat plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void chatFormat(AsyncPlayerChatEvent event) {

        // Objects variables
        Player player = event.getPlayer();

        // Chat format
        event.setFormat(player.getDisplayName() + ": " + event.getMessage());


    }
}
