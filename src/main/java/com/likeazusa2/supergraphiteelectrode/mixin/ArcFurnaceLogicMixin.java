package com.likeazusa2.supergraphiteelectrode.mixin;

import blusunrize.immersiveengineering.api.utils.ItemUtils;
import blusunrize.immersiveengineering.common.blocks.multiblocks.logic.arcfurnace.ArcFurnaceLogic;
import com.likeazusa2.supergraphiteelectrode.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ArcFurnaceLogic.class, remap = false)
public abstract class ArcFurnaceLogicMixin
{
    @Redirect(
            method = "tickServer",
            at = @At(
                    value = "INVOKE",
                    target = "Lblusunrize/immersiveengineering/api/utils/ItemUtils;damageStackableItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;I)V"
            ),
            remap = false
    )
    private void superGraphiteElectrode$preventElectrodeDamage(ItemStack stack, Level level, int amount)
    {
        if(!stack.is(ModItems.SUPER_GRAPHITE_ELECTRODE.get()))
            ItemUtils.damageStackableItem(stack, level, amount);
    }
}
