package gg.minehut.HypeGen;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import gg.minehut.HypeGen.commands.ReloadConfig;

public class ServerGens extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		saveConfig();
		registerCommand("reloadconfig", new ReloadConfig(this));
	}

	@Override
	public void onDisable() {

	}

	public void registerCommand(String name, CommandExecutor executor) {
		getCommand(name).setExecutor(executor);
	}

}
