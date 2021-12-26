package com.auct.auct.Voids;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class Consol_Voids {
	public static String PluginMessagePreFix = ChatColor.AQUA + "<AUCT.API> " + ChatColor.WHITE;

	public static String WarnMessage = PluginMessagePreFix + "" + ChatColor.RED;
	public static ConsoleCommandSender consol = Bukkit.getConsoleSender();

	// consol message abbriv
	public static void send(String message) {
		consol.sendMessage(PluginMessagePreFix + message);
	}

	public static void warn(String warn) {
		consol.sendMessage(WarnMessage + warn);
	}
}
