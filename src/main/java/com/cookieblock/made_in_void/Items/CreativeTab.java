package com.cookieblock.made_in_void.Items;

import com.cookieblock.made_in_void.Main;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, Main.MODID);

    public static final Supplier<CreativeModeTab> MADE_IN_VOID = CREATIVE_MODE_TABS.register("made_in_void",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Main.MODID + ".made_in_void"))
                    .icon(() -> new ItemStack(VoidItems.TOME_OF_THE_VOID.get()))
                    .displayItems((params, output) -> {
                        output.accept(VoidItems.LOW_PURITY_VOID.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
