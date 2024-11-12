package net.hehe.mccourse.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class SetHomeCommand {
    public SetHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("home").then(Commands.literal("set")
                .executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerpos = player.blockPosition();
        String positionString = "(" + playerpos.getX() + "," + playerpos.getY() + "," + playerpos.getZ() +")";

        player.getPersistentData().putIntArray("mccourse.homepos",
                new int[] { playerpos.getX(), playerpos.getY(), playerpos.getZ() });

        context.getSource().sendSuccess(() -> Component.literal("Set Home at" + positionString), true);
        return 1;

    }
}
