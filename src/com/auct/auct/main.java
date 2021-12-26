package com.auct.auct;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.auct.auct.Voids.Consol_Voids;


public class main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Consol_Voids.send("1 Plugin Process(AuctionAPI) Started with NO WARNINGS");
		getServer().getPluginManager().registerEvents(this, this);
//		this.getServer().getPluginManager().registerEvents(new atm(), this);
//		getCommand("w").setExecutor(new foradmins());
	}

	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String DisplayName = p.getDisplayName();
		
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
	}
	

	
}

