package me.kx.autosaver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoSaver extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "save-all"), 20 * 60 * 30, 20 * 60 * 30);
	}
}
