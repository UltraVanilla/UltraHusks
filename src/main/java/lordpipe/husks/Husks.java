package lordpipe.husks;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin to make husks drop sand
 *
 * @author Copyright (c) lordpipe. Licensed GPLv3
 */
public class Husks extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new DeathListener(this), this);
    }
}
