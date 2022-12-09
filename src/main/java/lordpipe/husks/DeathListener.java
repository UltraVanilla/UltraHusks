package lordpipe.husks;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DeathListener implements Listener {
    private Husks plugin;
    private final Random rnd = new Random();
    private double probability = 0.5;

    public DeathListener(Husks pl) {
        plugin = pl;
        probability = plugin.getConfig().getDouble("probability");
    }

    @EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        if (event.getEntity().getType() == EntityType.HUSK) {
            float rand = rnd.nextFloat();
            if (rand < probability)
                event.getDrops().add(new ItemStack(Material.SAND, 1));
        }
    }
}
