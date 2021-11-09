package dev.risas;

import dev.risas.module.rModuleService;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class rEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        rModuleService.init(this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static rEssentials get() {
        return rEssentials.getPlugin(rEssentials.class);
    }
}