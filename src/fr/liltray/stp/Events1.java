package fr.liltray.stp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class Events1 implements Listener {
	
	public void ChatSave(AsyncPlayerChatEvent e){
		Player p = e.getPlayer();
		String msg = e.getMessage();
		
	}
	
	@EventHandler
	public static void onClickInvPrincipal(InventoryClickEvent e) {
		
		String name = e.getClickedInventory().getName();
		Player p = (Player) e.getWhoClicked();
		int slot = e.getSlot();
		 ItemStack item = e.getWhoClicked().getInventory().getItem(slot);
		
		if(name == "§cMenu de teleportation" ) {
			if(item.getItemMeta().getDisplayName().equalsIgnoreCase("Admin TP")) {
				if(p.hasPermission("stp.fulltp")) {
				  p.closeInventory();
				  p.sendMessage("Ecrivez le  nom du joueur a qui vous voulez vous tp.");
				  
				String message = ChatSave;
				}
			}
		}
	}

}
