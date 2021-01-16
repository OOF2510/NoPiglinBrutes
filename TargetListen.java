package me.nate.NoPiglinBrutes.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.PiglinBrute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import me.nate.NoPiglinBrutes.Main;

public class TargetListen implements Listener {
	
	private Main plugin;
	
	public TargetListen(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void targetEvent(EntityTargetEvent t) {
		
		Entity e = t.getEntity();
		
		if(e instanceof PiglinBrute) {
			
			((PiglinBrute) e).remove();
			
		} else return;
		
	}

}
