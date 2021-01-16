package me.nate.NoPiglinBrutes.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.PiglinBrute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import me.nate.NoPiglinBrutes.Main;

public class SpawnListen implements Listener {

	private Main plugin;
	
	public SpawnListen(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void spawnEvent(EntitySpawnEvent s) {
		
		Entity e = s.getEntity();
		
		if(e instanceof PiglinBrute) {
			
			((PiglinBrute) e).remove();
			
		} else return;
		
	}
}