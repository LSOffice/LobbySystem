package net.lsoffice.lobbysystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class LobbySystem extends JavaPlugin {

    public static JavaPlugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

        getCommand("hub").setExecutor(new Commands());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
