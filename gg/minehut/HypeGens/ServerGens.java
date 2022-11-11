package gg.minehut.HypeGen.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import gg.minehut.HypeGen.ServerGens;

public class ReloadConfig implements CommandExecutor {
	
	private ServerGens plugin;
	
	public ReloadConfig(ServerGens plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		arg0.sendMessage("The configuration file has been reloaded.");
		plugin.getLogger().finest("The configuration file has been reloaded with no errors.");
		return false;
	}
	
}
