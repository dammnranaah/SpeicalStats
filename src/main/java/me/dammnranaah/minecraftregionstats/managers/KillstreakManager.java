package me.dammnranaah.minecraftregionstats.managers;

import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.Map;

public class KillstreakManager {
    private final Map<Player, Integer> killstreaks = new HashMap<>();

    public void incrementKillstreak(Player player) {
        killstreaks.put(player, killstreaks.getOrDefault(player, 0) + 1);
    }

    public void resetKillstreak(Player player) {
        killstreaks.remove(player);
    }

    public int getKillstreak(Player player) {
        return killstreaks.getOrDefault(player, 0);
    }
}
