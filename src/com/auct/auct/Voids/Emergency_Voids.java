package com.auct.auct.Voids;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


public class Emergency_Voids {
	
	public static String HeyEmerg = ChatColor.RED + "  긴급 공지 >>>";
	public static String Seg1 = "";
	public static String Seg2 = ChatColor.WHITE + "  안녕하세요 델타타임즈DelaTimes 서버 운영 총괄을 맡고 있는 captain0potlid입니다.";
	public static String Seg3 = ChatColor.WHITE + "1분 후 긴급 서버 점검이 있을 예정입니다. 점검 사유는 다음과 같습니다 : ";
	public static String Seg4 = ChatColor.WHITE + "서버 내 모든 진행 상황을 저장해주시기 바랍니다.";
	public static String Seg5 = "";
	public static String Seg6 = ChatColor.RED + "*2분 안에 나가시지 않으시는 플레이어의 데이터 손상에 대해 델타타임즈는 책임을 지지 않습니다.*";
	public static String Seg7 = ChatColor.WHITE + "진심으로 죄송하고, 양해 부탁드립니다. -이상 SYS 올림-";
	
	public static String people = "";
	
	public static void SystemEmergency(String why) {
		Consol_Voids.send("[ARX] Started Process <긴급공지> at runtime 12.5w to @Everyone");
		Consol_Voids.warn("[SWE] requested to send Emergency Messages to " + Bukkit.getOnlinePlayers().size() + " players");
		for(Player p: Bukkit.getOnlinePlayers()) {
			if(people.length() != 0) people = people + ", ";
			people = people + p.getDisplayName() + "[" + p.getUniqueId() + "]";
			
			Consol_Voids.send("[MK] requested to send Emergency Statement to player to server " + p.getDisplayName() + "["+ p.getUniqueId() + "]");
			p.sendMessage(HeyEmerg);
			p.sendMessage(Seg1);
			p.sendMessage(Seg2);
			p.sendMessage(Seg3 + ChatColor.GOLD + why);
			p.sendMessage(Seg4);
			p.sendMessage(Seg5);
			p.sendMessage(Seg6);
			p.sendMessage("");
			p.sendMessage(Seg7);
			Consol_Voids.send("[MK] sent Emergency Statement to player " + p.getDisplayName() + "["+ p.getUniqueId() + "]");
		}
		Consol_Voids.warn("[SWE] Successfully Sent Emergency Messages to " + Bukkit.getOnlinePlayers().size() + " players");
		Consol_Voids.send("[ARX] Finished Process <긴급공지> at runtime 12.5w to " + people);
	}
}
