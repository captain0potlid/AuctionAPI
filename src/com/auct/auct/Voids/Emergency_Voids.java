package com.auct.auct.Voids;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


public class Emergency_Voids {
	
	public static String HeyEmerg = ChatColor.RED + "  ��� ���� >>>";
	public static String Seg1 = "";
	public static String Seg2 = ChatColor.WHITE + "  �ȳ��ϼ��� ��ŸŸ����DelaTimes ���� � �Ѱ��� �ð� �ִ� captain0potlid�Դϴ�.";
	public static String Seg3 = ChatColor.WHITE + "1�� �� ��� ���� ������ ���� �����Դϴ�. ���� ������ ������ �����ϴ� : ";
	public static String Seg4 = ChatColor.WHITE + "���� �� ��� ���� ��Ȳ�� �������ֽñ� �ٶ��ϴ�.";
	public static String Seg5 = "";
	public static String Seg6 = ChatColor.RED + "*2�� �ȿ� �������� �����ô� �÷��̾��� ������ �ջ� ���� ��ŸŸ����� å���� ���� �ʽ��ϴ�.*";
	public static String Seg7 = ChatColor.WHITE + "�������� �˼��ϰ�, ���� ��Ź�帳�ϴ�. -�̻� SYS �ø�-";
	
	public static String people = "";
	
	public static void SystemEmergency(String why) {
		Consol_Voids.send("[ARX] Started Process <��ް���> at runtime 12.5w to @Everyone");
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
		Consol_Voids.send("[ARX] Finished Process <��ް���> at runtime 12.5w to " + people);
	}
}
