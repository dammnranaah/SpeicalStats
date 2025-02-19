package me.dammnranaah.minecraftregionstats.listeners;

import me.dammnranaah.minecraftregionstats.Main;
import me.dammnranaah.minecraftregionstats.managers.KillstreakManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener {
    private final KillstreakManager killstreakManager;

    public KillListener(KillstreakManager killstreakManager) {
        this.killstreakManager = killstreakManager;
    }

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Player killer = victim.getKiller();

        if (killer != null) {
            killstreakManager.incrementKillstreak(killer);
            killstreakManager.resetKillstreak(victim);
        }
    }
}