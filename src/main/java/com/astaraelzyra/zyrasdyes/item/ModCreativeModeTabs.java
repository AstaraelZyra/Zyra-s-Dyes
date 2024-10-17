package com.astaraelzyra.zyrasdyes.item;

import com.astaraelzyra.zyrasdyes.ZyrasDyes;
import com.astaraelzyra.zyrasdyes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZyrasDyes.MOD_ID);

    public static final Supplier<CreativeModeTab> ZYRAS_DYES_ALL_ITEMS_TAB = CREATIVE_MODE_TAB.register("zyras_dyes_all_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BERRY_CONCRETE.get()))
                    .title(Component.translatable("creativetab.zyrasdyes.zyras_dyes_all_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BERRY_DYE);
                        output.accept(ModItems.INDIGO_DYE);
                        output.accept(ModItems.LAVENDER_DYE);
                        output.accept(ModItems.SCARLET_DYE);
                        output.accept(ModItems.COOL_LIGHT_GRAY_DYE);
                        output.accept(ModItems.SEAFOAM_DYE);

                        output.accept(ModBlocks.BERRY_CONCRETE);
                        output.accept(ModBlocks.INDIGO_CONCRETE);
                        output.accept(ModBlocks.LAVENDER_CONCRETE);
                        output.accept(ModBlocks.SCARLET_CONCRETE);
                        output.accept(ModBlocks.COOL_LIGHT_GRAY_CONCRETE);
                        output.accept(ModBlocks.SEAFOAM_CONCRETE);

                        output.accept(ModBlocks.BERRY_CONCRETE_POWDER);
                        output.accept(ModBlocks.INDIGO_CONCRETE_POWDER);
                        output.accept(ModBlocks.LAVENDER_CONCRETE_POWDER);
                        output.accept(ModBlocks.SCARLET_CONCRETE_POWDER);
                        output.accept(ModBlocks.COOL_LIGHT_GRAY_CONCRETE_POWDER);
                        output.accept(ModBlocks.SEAFOAM_CONCRETE_POWDER);

                        output.accept(ModBlocks.BERRY_STAINED_GLASS);
                        output.accept(ModBlocks.INDIGO_STAINED_GLASS);
                        output.accept(ModBlocks.LAVENDER_STAINED_GLASS);
                        output.accept(ModBlocks.SCARLET_STAINED_GLASS);
                        output.accept(ModBlocks.COOL_LIGHT_GRAY_STAINED_GLASS);
                        output.accept(ModBlocks.SEAFOAM_STAINED_GLASS);

                        output.accept(ModBlocks.TANZANITE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TANZANITE_ORE);
                        output.accept(ModItems.TANZANITE);
                        output.accept(ModBlocks.TANZANITE_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> DYES_ITEMS_TAB = CREATIVE_MODE_TAB.register("dyes_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BERRY_DYE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ZyrasDyes.MOD_ID, "zyras_dyes_all_items_tab"))
                    .title(Component.translatable("creativetab.zyrasdyes.dye_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BERRY_DYE);
                        output.accept(ModItems.INDIGO_DYE);
                        output.accept(ModItems.LAVENDER_DYE);
                        output.accept(ModItems.SCARLET_DYE);
                        output.accept(ModItems.COOL_LIGHT_GRAY_DYE);
                        output.accept(ModItems.SEAFOAM_DYE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
