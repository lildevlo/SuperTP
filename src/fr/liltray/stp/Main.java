package fr.liltray.stp;

import org.bukkit.plugin.java.JavaPlugin;

import fr.liltray.stp.cmds.SuperTPCommand;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getCommand("tp").setExecutor(new SuperTPCommand());
		getServer().getPluginManager().registerEvents(new Events1(), this);
	}

}
