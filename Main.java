package me.nate.NoPiglinBrutes;

import org.bukkit.plugin.java.JavaPlugin;

import me.nate.NoPiglinBrutes.listeners.SpawnListen;
import me.nate.NoPiglinBrutes.listeners.TargetListen;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new SpawnListen(this);
		new TargetListen(this);
	}

}
