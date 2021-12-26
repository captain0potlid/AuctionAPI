package com.auct.auct.Voids;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Message_Voids {
	
	public static String ToMessagePreFix = ChatColor.GOLD + "[ " + ChatColor.AQUA + "°æ¸Å" + ChatColor.GOLD + " ]"
			+ ChatColor.YELLOW + "  |  ";

	public static String ToWarnMessagePreFix = ToMessagePreFix + "" + ChatColor.RED;
	
	public static void send(Player p, String msg) {
		p.sendMessage(ToMessagePreFix + msg);
	}
	
	public static void warn(Player p, String msg) {
		p.sendMessage(ToWarnMessagePreFix + msg);
	}
}
