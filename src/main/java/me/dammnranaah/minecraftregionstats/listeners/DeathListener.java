package me.dammnranaah.minecraftregionstats.listeners;

import me.dammnranaah.minecraftregionstats.managers.KillstreakManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;

public class DeathListener implements Listener {
    private final KillstreakManager killstreakManager;

    public DeathListener(KillstreakManager killstreakManager) {
        this.killstreakManager = killstreakManager;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        killstreakManager.resetKillstreak(player);
    }
}
