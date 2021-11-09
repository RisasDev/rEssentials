package dev.risas.module.impl.listener;

import dev.risas.module.rModule;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Risas
 * Project: rEssentials
 * Date: 08-11-2021 - 23:26
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */
public class ListenerModule extends rModule {

    @Override
    public String getName() {
        return "Listener";
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void onEnable(JavaPlugin plugin) {
        loadedLog();
    }
}
