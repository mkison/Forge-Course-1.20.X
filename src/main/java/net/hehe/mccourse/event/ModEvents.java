package net.hehe.mccourse.event;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.command.ReturnHomeCommand;
import net.hehe.mccourse.command.SetHomeCommand;
import net.hehe.mccourse.item.ModItems;
import net.hehe.mccourse.item.custom.HammerItem;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(modid = MCCourseMod.MOD_ID)
public class ModEvents {

    // Done with the help of https://github.com/CoFH/CoFHCore/blob/1.19.x/src/main/java/cofh/core/event/AreaEffectEvents.java
    // Don't be a jerk License
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();
    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer) {
            BlockPos initalBlockPos = event.getPos();
            if (HARVESTED_BLOCKS.contains(initalBlockPos)) {
                return;
            }

            for (BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initalBlockPos, serverPlayer)) {
                if(pos == initalBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                // Have to add them to a Set otherwise, the same code right here will get called for each block!
                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event) {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {
        event.getEntity().getPersistentData().putIntArray("mccourse.homepos", event.getOriginal().getPersistentData().getIntArray("mccourse.homepos"));
    }

    @SubscribeEvent
    public static void livingDamage(LivingDamageEvent event) {
        if (event.getEntity() instanceof Villager) {
            if (event.getSource().getDirectEntity() instanceof Player player) {
                if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == ModItems.ALEXANDRITE_SWORD.get()) {
                    MCCourseMod.LOGGER.info("Sheep was hit with Alexandrite Sword by" + player.getName().getString());
                    player.sendSystemMessage(Component.literal("No no no Mr. " + player.getName().getString() + "-Ayri, don't slap this guy."));
                    player.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 255));

                } else if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == ModItems.ALEXANDRITE_HAMMER.get()) {
                    MCCourseMod.LOGGER.info("Villager was hit with Alexandrite Hammer by " + player.getName().getString());
                    player.sendSystemMessage(Component.literal("You've transformed the villager! You dumb stupid fool"));

                    var level = event.getEntity().level();
                    BlockPos position = event.getEntity().blockPosition();

                    event.getEntity().discard();

                    var magician = EntityType.EVOKER.create(level);
                    if (magician != null) {
                        magician.moveTo(position.getX() + 0.5, position.getY(), position.getZ() + 0.5, event.getEntity().getYRot(), event.getEntity().getXRot());
                        magician.setCustomName(Component.literal(player.getName().getString() + " Ist schuld daran, so ein Rindvieh!"));
                        level.addFreshEntity(magician);
                    }
                }

                else if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == ModItems.PEAT_BRICK.get()) {
                    player.sendSystemMessage(Component.literal("Look at this dude"));

                    var level = event.getEntity().level();
                    BlockPos position = event.getEntity().blockPosition();

                    event.getEntity().discard();

                    var johnny = EntityType.VINDICATOR.create(level);
                    if (johnny != null) {
                        johnny.moveTo(position.getX() + 0.5, position.getY(), position.getZ() + 0.5, event.getEntity().getYRot(), event.getEntity().getXRot());
                        johnny.setCustomName(Component.literal("Johnny"));
                        level.addFreshEntity(johnny);
                    }
                }
                else if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == Items.BELL) {
                    player.sendSystemMessage(Component.literal("hehe"));

                    event.getEntity().setCustomName(Component.literal("jeb_"));
                }
            }
        }
    }
}
