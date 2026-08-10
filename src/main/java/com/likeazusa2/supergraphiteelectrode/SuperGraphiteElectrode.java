package com.likeazusa2.supergraphiteelectrode;

import com.likeazusa2.supergraphiteelectrode.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(SuperGraphiteElectrode.MOD_ID)
public final class SuperGraphiteElectrode
{
    public static final String MOD_ID = "super_graphite_electrode";
    private static final ResourceKey<CreativeModeTab> IE_CREATIVE_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath("immersiveengineering", "main")
    );

    public SuperGraphiteElectrode(IEventBus modBus)
    {
        ModItems.ITEMS.register(modBus);
        modBus.addListener(SuperGraphiteElectrode::addCreativeTabContents);
    }

    private static void addCreativeTabContents(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey()==IE_CREATIVE_TAB)
            event.accept(ModItems.SUPER_GRAPHITE_ELECTRODE.get());
    }
}
