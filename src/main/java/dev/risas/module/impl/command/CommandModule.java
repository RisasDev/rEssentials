package dev.risas.module.impl.command;

import dev.panda.command.CommandManager;
import dev.risas.commands.rEssentialCommand;
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
    public String getName() {
        return "Command";
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void onEnable(JavaPlugin plugin) {
        new CommandManager(plugin, new ArrayList<>());

        // rEssentials Commands
        new rEssentialCommand();

        loadedLog();
    }
}
