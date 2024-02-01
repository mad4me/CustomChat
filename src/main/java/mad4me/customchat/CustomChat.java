/*
* Custom Chat
* Made by Mad4Me
* */

package mad4me.customchat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import mad4me.customchat.handlers.chatHandler;

public final class CustomChat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("[CustomChat] The plugin is now working!");
        new chatHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("[CustomChat] The plugin is shutting down.");
    }
}
