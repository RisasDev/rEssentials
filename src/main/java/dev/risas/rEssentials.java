package dev.risas;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class rEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static rEssentials get() {
        return rEssentials.getPlugin(rEssentials.class);
    }
}