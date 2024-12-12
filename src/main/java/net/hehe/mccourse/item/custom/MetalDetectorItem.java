package net.hehe.mccourse.item.custom;

import net.hehe.mccourse.sound.ModSounds;
import net.hehe.mccourse.util.InventoryUtil;
import net.hehe.mccourse.util.ModTags;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState blockState = pContext.getLevel().getBlockState(positionClicked.below(i));

                if(isValuableBlock(blockState)) {
                    outputValuableCoordinates(positionClicked.below(i), player, blockState.getBlock());
                    foundBlock = true;

                    pContext.getLevel().playSeededSound(null, player.getX(), player.getY(), player.getZ(),
                            ModSounds.METAL_DETECTOR_FOUND_ORE.get(), SoundSource.PLAYERS, 1f, 1f, 0);


                    if (InventoryUtil.hasPlayerStackInInventory(player, ModItems.DATA_TABLET.get())) {
                        addDataToDataTablet(player, positionClicked.below(i), blockState.getBlock());
                    }

                    break;

                }
            }
            if (!foundBlock) {
                outputNoValuableFound(player);
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private void addDataToDataTablet(Player player, BlockPos below, Block block) {
        ItemStack dataTablet = player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.DATA_TABLET.get()));

        CompoundTag data = new CompoundTag();
        data.putString("mccourse.found_ore","Valuable Found: " + I18n.get(block.getDescriptionId())
                + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")");

        dataTablet.setTag(data);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.mccourse.metal_detector.tooltip.shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.mccourse.metal_detector.tooltip"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    private void outputNoValuableFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.mccourse.metal_detector.no_valuables"));
    }

    private void outputValuableCoordinates(BlockPos below, Player player, Block block) {
        player.sendSystemMessage(Component.translatable("item.mccourse.metal_detector_valuables"));
        player.sendSystemMessage(Component.translatable(I18n.get(block.getDescriptionId())
        + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.is(ModTags.Blocks.METAL_DETECTOR_VALUABLES);
    }
}
