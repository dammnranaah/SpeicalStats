package me.dammnranaah.minecraftregionstats;

import me.dammnranaah.minecraftregionstats.listeners.DeathListener;
import me.dammnranaah.minecraftregionstats.listeners.KillListener;
import me.dammnranaah.minecraftregionstats.managers.KillstreakManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private KillstreakManager killstreakManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        killstreakManager = new KillstreakManager();
        getServer().getPluginManager().registerEvents(new KillListener(killstreakManager), this);
        getServer().getPluginManager().registerEvents(new DeathListener(killstreakManager), this);
        getLogger().info("MinecraftRegionStats enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MinecraftRegionStats disabled!");
    }

    public KillstreakManager getKillstreakManager() {
        return killstreakManager;
    }
}