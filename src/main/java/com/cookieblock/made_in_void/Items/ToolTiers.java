package com.cookieblock.made_in_void.Items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ToolTiers {
    public static final Tier VoidTierI = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            50,5f,0f,5,
            () -> Ingredient.EMPTY
    );
}
