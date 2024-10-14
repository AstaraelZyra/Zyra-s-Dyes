package com.astaraelzyra.zyrasdyes.block;

import com.astaraelzyra.zyrasdyes.ZyrasDyes;
import com.astaraelzyra.zyrasdyes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ZyrasDyes.MOD_ID);

    public static final DeferredBlock<Block> INDIGO_CONCRETE = registerBlock("indigo_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BERRY_CONCRETE = registerBlock("berry_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SCARLET_CONCRETE = registerBlock("scarlet_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SEAFOAM_CONCRETE = registerBlock("seafoam_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> LAVENDER_CONCRETE = registerBlock("lavender_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> COOL_LIGHT_GRAY_CONCRETE = registerBlock("cool_light_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F).sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
