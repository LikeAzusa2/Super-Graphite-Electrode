package com.likeazusa2.supergraphiteelectrode.item;

import com.likeazusa2.supergraphiteelectrode.SuperGraphiteElectrode;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/** Central Forge item registry for this mod. */
public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, SuperGraphiteElectrode.MOD_ID
    );

    public static final RegistryObject<SuperGraphiteElectrodeItem> SUPER_GRAPHITE_ELECTRODE = ITEMS.register(
            "super_graphite_electrode", SuperGraphiteElectrodeItem::new
    );

    private ModItems()
    {
    }
}
