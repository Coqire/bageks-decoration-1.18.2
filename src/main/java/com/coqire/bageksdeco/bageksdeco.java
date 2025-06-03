package com.coqire.bageksdeco;

import com.coqire.bageksdeco.block.ModBlocks;
import com.coqire.bageksdeco.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(bageksdeco.Mod_ID)
public class bageksdeco {
    public static final String Mod_ID = "bageksdeco";
    private static final Logger LOGGER = LogUtils.getLogger();

    public bageksdeco() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSESTATE_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATETHREE_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ESTATEFOUR_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATEFOUR_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DBLESTATETHREE_1.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANGESTATETHREE_2.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANG1ESTATETHREE_2.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANGESTATEFOUR_2.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANG1ESTATEFOUR_2.get(), RenderType.solid());



        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENGLISH_SADDLE_SWEM_BLACK.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENGLISH_SADDLE_SWEM_BROWN.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FEED_BAG_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FEED_BAG_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FEED_BAG_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FEED_BAG_4.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_10.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HPW_11.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BAGEK_SWEATSCRAPER_1.get(), RenderType.solid());

    }
}