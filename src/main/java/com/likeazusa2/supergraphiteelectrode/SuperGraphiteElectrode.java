package com.likeazusa2.supergraphiteelectrode;

import com.likeazusa2.supergraphiteelectrode.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SuperGraphiteElectrode.MOD_ID)
public final class SuperGraphiteElectrode
{
    public static final String MOD_ID = "super_graphite_electrode";
    /** IE does not expose its main tab registry object, so use its stable registry ID. */
    private static final ResourceLocation IMMERSIVE_ENGINEERING_MAIN_TAB = new ResourceLocation("immersiveengineering", "main");

    public SuperGraphiteElectrode()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modBus);
        modBus.addListener(SuperGraphiteElectrode::addCreativeTabContents);
    }

    private static void addCreativeTabContents(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey().location().equals(IMMERSIVE_ENGINEERING_MAIN_TAB))
        {
            event.accept(ModItems.SUPER_GRAPHITE_ELECTRODE.get());
        }
    }
}
