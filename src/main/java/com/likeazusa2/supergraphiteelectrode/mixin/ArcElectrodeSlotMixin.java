package com.likeazusa2.supergraphiteelectrode.mixin;

import blusunrize.immersiveengineering.common.gui.IESlot;
import com.likeazusa2.supergraphiteelectrode.item.ModItems;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IESlot.ArcElectrode.class)
public abstract class ArcElectrodeSlotMixin
{
    /** IE normally accepts only its exact graphite-electrode item instance. */
    @Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
    private void superGraphiteElectrode$acceptInfiniteElectrode(
            ItemStack stack, CallbackInfoReturnable<Boolean> callback
    )
    {
        if(stack.is(ModItems.SUPER_GRAPHITE_ELECTRODE.get()))
        {
            callback.setReturnValue(true);
        }
    }
}
