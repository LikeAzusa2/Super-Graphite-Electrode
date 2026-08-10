package com.likeazusa2.supergraphiteelectrode.item;

import blusunrize.immersiveengineering.common.items.GraphiteElectrodeItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * An infinite Arc Furnace electrode that retains IE's configurable durability bar and stack size.
 * {@link com.likeazusa2.supergraphiteelectrode.mixin.ArcFurnaceLogicMixin} prevents the bar from decreasing.
 */
public final class SuperGraphiteElectrodeItem extends GraphiteElectrodeItem
{
    @Override
    public boolean isFoil(ItemStack stack)
    {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag)
    {
        tooltip.add(Component.translatable("tooltip.super_graphite_electrode.infinite")
                .withStyle(ChatFormatting.LIGHT_PURPLE));
    }
}
