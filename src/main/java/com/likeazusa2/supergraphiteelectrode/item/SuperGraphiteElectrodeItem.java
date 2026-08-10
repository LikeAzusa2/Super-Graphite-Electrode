package com.likeazusa2.supergraphiteelectrode.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

/**
 * A graphite electrode accepted by Immersive Engineering's Arc Furnace.
 * ArcFurnaceLogicMixin prevents its durability from ever decreasing.
 */
public final class SuperGraphiteElectrodeItem extends Item
{
    private static final int DISPLAY_MAX_DAMAGE = 96_000;

    public SuperGraphiteElectrodeItem()
    {
        super(new Properties().durability(DISPLAY_MAX_DAMAGE));
    }

    @Override
    public boolean isFoil(ItemStack stack)
    {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag)
    {
        tooltip.add(Component.translatable("tooltip.super_graphite_electrode.infinite").withStyle(ChatFormatting.LIGHT_PURPLE));
    }
}
