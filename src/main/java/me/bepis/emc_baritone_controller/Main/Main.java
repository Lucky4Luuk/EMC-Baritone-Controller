package me.bepis.emc_baritone_controller.Main;

import me.bepis.emc_baritone_controller.Commands.BaritoneController;

import me.deftware.client.framework.main.EMCMod;
// import me.deftware.client.framework.wrappers.IMinecraft;
import me.deftware.client.framework.command.CommandRegister;
import me.deftware.client.framework.event.EventBus;
import me.deftware.client.framework.event.EventHandler;
import me.deftware.client.framework.event.events.*;

public class Main extends EMCMod {

	public static final String name = "Baritone Controller";
	// public static int version;

	@Override
	public void initialize() {
		EventBus.registerClass(this.getClass(), this);

		CommandRegister.registerCommand(new BaritoneController());
	}

}
