package me.bepis.emc_baritone_controller.Commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import me.deftware.client.framework.command.CommandBuilder;
import me.deftware.client.framework.command.EMCModCommand;
import me.deftware.client.framework.wrappers.IChat;

public class BaritoneController extends EMCModCommand {
	@Override
	public CommandBuilder getCommandBuilder() {
		return new CommandBuilder().set(LiteralArgumentBuilder.literal("test")
				.then(
					LiteralArgumentBuilder.literal("one")
						.executes(c -> {
							IChat.sendChatMessage("yeet");
							return 1;
						})
				)
				.then(
					LiteralArgumentBuilder.literal("two")
						.executes(c -> {
							IChat.sendChatMessage("@mine diamond_ore");
							return 1;
						})
				)
		);
	}
}
