package dev.risas.module.impl.command;

import dev.panda.command.CommandManager;
import dev.risas.module.rModule;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

/**
 * Created by Risas
 * Project: rEssentials
 * Date: 08-11-2021 - 22:48
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public class CommandModule extends rModule {

    @Override
    public void setName(String name) {
        super.setName("Command");
    }

    @Override
    public void setPriority(int priority) {
        super.setPriority(1);
    }

    @Override
    public void onEnable(JavaPlugin plugin) {
        new CommandManager(plugin, new ArrayList<>());

        loadedLog();
    }
}
