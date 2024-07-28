package com.cookieblock.made_in_void.Items;

import com.cookieblock.made_in_void.Main;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class VoidItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, Main.MODID);

    public static final Supplier<Item> LOW_PURITY_VOID = ITEMS.register("low_purity_void",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> TOME_OF_THE_VOID = ITEMS.register("tome_of_the_void",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}