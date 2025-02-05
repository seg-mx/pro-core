package me.atog.procore;

import com.sun.istack.internal.NotNull;
import org.bukkit.plugin.java.JavaPlugin;

import me.atog.procore.commandos.DestroyCommand;
import me.atog.procore.commandos.GameModeCommand;
import me.atog.procore.commandos.PluginCommandFlyMode;

public class ProCorePlugin extends JavaPlugin {

	@Override
	@NotNull
	public final void onEnable() {
		ProCorePlugin2.onEnable(this);
	}

	@Override
	@NotNull
	public final void onDisable() {
		ProCorePlugin2.onDisable(this);
	}

	@NotNull public final void registerCommandos() {
		getCommand("gm").setExecutor(new GameModeCommand());
		getCommand("fly").setExecutor(new PluginCommandFlyMode());
		getCommand("destroy").setExecutor(new DestroyCommand());
	}
	
}
