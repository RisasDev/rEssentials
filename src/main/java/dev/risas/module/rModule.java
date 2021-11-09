package dev.risas.module;

import dev.panda.chat.ChatUtil;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public abstract class rModule {

    private String name;
    private int priority;

    @Getter
    private static final List<rModule> modules = new ArrayList<>();

    public rModule() {
        modules.add(this);
    }

    public abstract void onEnable(JavaPlugin plugin);

    public void loadedLog() {
        ChatUtil.log("[rEssentials] Successfully loaded " + this.getName() + " Module.");
    }
}
