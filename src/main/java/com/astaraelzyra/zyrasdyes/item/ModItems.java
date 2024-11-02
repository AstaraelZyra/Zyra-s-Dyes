package com.astaraelzyra.zyrasdyes.item;

import com.astaraelzyra.zyrasdyes.ZyrasDyes;
import com.astaraelzyra.zyrasdyes.item.custom.OxidizerItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ZyrasDyes.MOD_ID);


    public static final DeferredItem<Item> INDIGO_DYE = ITEMS.register("indigo_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERRY_DYE = ITEMS.register("berry_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCARLET_DYE = ITEMS.register("scarlet_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SEAFOAM_DYE = ITEMS.register("seafoam_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAVENDER_DYE = ITEMS.register("lavender_dye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COOL_LIGHT_GRAY_DYE = ITEMS.register("cool_light_gray_dye",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TANZANITE = ITEMS.register("tanzanite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WATERING_CAN = ITEMS.register("watering_can",
            () -> new OxidizerItem(new Item.Properties().durability(32)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
