package fr.liltray.stp.cmds;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SuperTPCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String laabel, String[] args) {
		if(sender instanceof Player) {
			Inventory menuPrincipal = Bukkit.createInventory(null, 27, "§cMenu de teleportation");
			ItemStack adTp = new ItemStack(Material.GREEN_GLAZED_TERRACOTTA);
			ItemStack nmTpa = new ItemStack(Material.RED_GLAZED_TERRACOTTA);
			
			ItemMeta adTM = adTp.getItemMeta();
			adTM.setDisplayName("Admin TP");
			adTp.setItemMeta(adTM);
			
			ItemMeta nmTM = adTp.getItemMeta();
			nmTM.setDisplayName("Normal TPA");
			nmTpa.setItemMeta(nmTM);
			
			menuPrincipal.setItem(12, adTp);
			menuPrincipal.setItem(12, nmTpa);
			
			Player p = (Player)sender;
			p.openInventory(menuPrincipal);
			
		}else {
			sender.sendMessage("Vous devez etre un joueur pour executer cette commande.");
		}
		return false;
	}

}
