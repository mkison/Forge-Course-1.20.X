package net.hehe.mccourse.item.custom;

import net.hehe.mccourse.MCCourseMod;
import net.hehe.mccourse.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;


public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.DATA_TABLET.get(), new ResourceLocation(MCCourseMod.MOD_ID, "on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f);

    }

}
