package net.hehe.mccourse.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;


public class SouthMiner extends Item {


    private static final int DRILL_LIMIT = 360;

    public SouthMiner(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        ItemStack itemInHand = context.getItemInHand();
        if (!itemInHand.hasTag()) itemInHand.setTag(new CompoundTag());
        itemInHand.getTag().putInt("usesLeft", DRILL_LIMIT);

        if (!context.getLevel().isClientSide()) {
            Level level = context.getLevel();
            BlockPos blockPos = context.getClickedPos();
            BlockState blockState = level.getBlockState(blockPos);
            List<BlockPos> blockPosList = List.of(blockPos);

            if (mineOres(itemInHand, level, blockPosList, blockState)) {
                int uses = DRILL_LIMIT - itemInHand.getTag().getInt("usesLeft");
            //    context.getPlayer().getCooldowns().addCooldown(this, 20 * uses);
                context.getItemInHand().hurtAndBreak(uses, context.getPlayer(), p -> p.broadcastBreakEvent(context.getHand()));
            }
        } else return InteractionResult.PASS;

        return InteractionResult.SUCCESS;

    }
    private static boolean isDrillable (Block block) {
        return (
                block == Blocks.IRON_ORE ||
                block == Blocks.COAL_ORE ||
                block == Blocks.GOLD_ORE ||
                block == Blocks.DIAMOND_ORE ||
                block == Blocks.COPPER_ORE ||
                block == Blocks.REDSTONE_ORE ||
                block == Blocks.LAPIS_ORE ||
                block == Blocks.EMERALD_ORE ||
                block == Blocks.DEEPSLATE_IRON_ORE ||
                block == Blocks.DEEPSLATE_COAL_ORE ||
                block == Blocks.DEEPSLATE_GOLD_ORE ||
                block == Blocks.DEEPSLATE_DIAMOND_ORE ||
                block == Blocks.DEEPSLATE_COPPER_ORE ||
                block == Blocks.DEEPSLATE_REDSTONE_ORE ||
                block == Blocks.DEEPSLATE_LAPIS_ORE ||
                block == Blocks.DEEPSLATE_EMERALD_ORE ||
                block == Blocks.STONE ||
                block == Blocks.GRASS_BLOCK ||
                block == Blocks.DEEPSLATE ||
                block == Blocks.GRAVEL ||
                block == Blocks.SAND ||
                block == Blocks.DIRT||
                block == Blocks.TUFF ||
                block == Blocks.NETHERRACK ||
                block == Blocks.END_STONE ||
                block == Blocks.ANDESITE ||
                block == Blocks.DIORITE ||
                block == Blocks.GRANITE
        );
    }
    private boolean mineOres (ItemStack itemInHand, Level level, List<BlockPos> blockPosList,BlockState blockState) {
        boolean startCooldown = false;

        for (BlockPos blockPos : blockPosList) {
            BlockState tempBlockState = level.getBlockState(blockPos);
            Block block = tempBlockState.getBlock();

            if (isDrillable(block) && tempBlockState == blockState && itemInHand.getTag().getInt("usesLeft") > 0) {
                itemInHand.getTag().putInt("usesLeft",itemInHand.getTag().getInt("usesLeft")-1);

                List<BlockPos> nextBlocks = List.of(

                        blockPos.south());

                level.destroyBlock(blockPos,true);
                mineOres(itemInHand,level,nextBlocks,blockState);

                startCooldown = true;
            }
        }
        return  startCooldown;
    }

}
