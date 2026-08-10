package com.likeazusa2.supergraphiteelectrode.item;

import com.likeazusa2.supergraphiteelectrode.SuperGraphiteElectrode;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperGraphiteElectrode.MOD_ID);

    public static final DeferredHolder<Item, SuperGraphiteElectrodeItem> SUPER_GRAPHITE_ELECTRODE = ITEMS.register(
            "super_graphite_electrode",
            SuperGraphiteElectrodeItem::new
    );

    private ModItems()
    {
    }
}
