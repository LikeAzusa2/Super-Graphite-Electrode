package com.likeazusa2.supergraphiteelectrode.mixin;

import blusunrize.immersiveengineering.common.blocks.multiblocks.logic.arcfurnace.ArcFurnaceLogic;
import com.likeazusa2.supergraphiteelectrode.item.ModItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ArcFurnaceLogic.class)
public abstract class ArcFurnaceLogicMixin
{
    /** Preserve IE's normal damage call for every other item while keeping this electrode infinite. */
    @Redirect(
            method = "tickServer",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/ItemStack;hurt(ILnet/minecraft/util/RandomSource;Lnet/minecraft/server/level/ServerPlayer;)Z"
            )
    )
    private boolean superGraphiteElectrode$preventElectrodeDamage(
            ItemStack stack, int amount, RandomSource random, ServerPlayer player
    )
    {
        if(stack.is(ModItems.SUPER_GRAPHITE_ELECTRODE.get()))
        {
            return false;
        }
        return stack.hurt(amount, random, player);
    }
}
