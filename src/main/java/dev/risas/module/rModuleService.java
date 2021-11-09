package dev.risas.module;

import lombok.experimental.UtilityClass;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Risas
 * Project: rEssentials
 * Date: 08-11-2021 - 23:20
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

@UtilityClass
public class rModuleService {

    public void init(JavaPlugin plugin) {
        for (rModule module : rModuleService.getOrderModules()) {
            module.onEnable(plugin);
        }
    }

    public List<rModule> getOrderModules() {
        List<rModule> rModules = rModule.getModules();
        rModules.sort(Comparator.comparingInt(rModule::getPriority));
        return rModules;
    }
}
