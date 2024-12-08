package com.astaraelzyra.zyrasdyes.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;


import static net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps.OXIDIZABLES;

public class OxidizerItem extends Item {

    public OxidizerItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        Holder<Block> holder = clickedBlock.defaultBlockState().getBlockHolder();

        Oxidizable oxidization_data = holder.getData(OXIDIZABLES);

        if(oxidization_data != null) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), oxidization_data.nextOxidationStage().defaultBlockState());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
