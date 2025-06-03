package com.coqire.bageksdeco.block;
import com.coqire.bageksdeco.bageksdeco;

import com.coqire.bageksdeco.block.custom.*;

import com.coqire.bageksdeco.item.DecoCreativeModeTab;
import com.coqire.bageksdeco.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, bageksdeco.Mod_ID);

    //CROSSBUCKS
    public static final RegistryObject<Block> CROSSBUCK_1 = registerBlock("crossbuck_1",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_2 = registerBlock("crossbuck_2",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_3 = registerBlock("crossbuck_3",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_4 = registerBlock("crossbuck_4",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_5 = registerBlock("crossbuck_5",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_6 = registerBlock("crossbuck_6",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_7 = registerBlock("crossbuck_7",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_8 = registerBlock("crossbuck_8",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_9 = registerBlock("crossbuck_9",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_10 = registerBlock("crossbuck_10",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_11 = registerBlock("crossbuck_11",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

//CROSSESTATES
    public static final RegistryObject<Block> CROSSESTATE_1 = registerBlock("crossestate_1",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_2 = registerBlock("crossestate_2",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_3 = registerBlock("crossestate_3",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_4 = registerBlock("crossestate_4",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_5 = registerBlock("crossestate_5",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_6 = registerBlock("crossestate_6",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_7 = registerBlock("crossestate_7",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_8 = registerBlock("crossestate_8",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_9 = registerBlock("crossestate_9",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_10 = registerBlock("crossestate_10",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSESTATE_11 = registerBlock("crossestate_11",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    //ESTATETHREE
    public static final RegistryObject<Block> ESTATETHREE_1 = registerBlock("estatethree_1",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_2 = registerBlock("estatethree_2",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_3 = registerBlock("estatethree_3",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_4 = registerBlock("estatethree_4",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_5 = registerBlock("estatethree_5",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_6 = registerBlock("estatethree_6",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_7 = registerBlock("estatethree_7",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_8 = registerBlock("estatethree_8",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_9 = registerBlock("estatethree_9",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_10 = registerBlock("estatethree_10",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATETHREE_11 = registerBlock("estatethree_11",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    //ESTATEFOUR
    public static final RegistryObject<Block> ESTATEFOUR_1 = registerBlock("estatefour_1",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_2 = registerBlock("estatefour_2",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_3 = registerBlock("estatefour_3",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_4 = registerBlock("estatefour_4",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_5 = registerBlock("estatefour_5",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_6 = registerBlock("estatefour_6",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_7 = registerBlock("estatefour_7",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_8 = registerBlock("estatefour_8",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_9 = registerBlock("estatefour_9",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_10 = registerBlock("estatefour_10",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_11 = registerBlock("estatefour_11",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    //DOUBLE FOUR ESTATE
    public static final RegistryObject<Block> DBLESTATEFOUR_1 = registerBlock("dblestatefour_1",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_2 = registerBlock("dblestatefour_2",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_3 = registerBlock("dblestatefour_3",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_4 = registerBlock("dblestatefour_4",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_5 = registerBlock("dblestatefour_5",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_6 = registerBlock("dblestatefour_6",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_7 = registerBlock("dblestatefour_7",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_8 = registerBlock("dblestatefour_8",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_9 = registerBlock("dblestatefour_9",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_10 = registerBlock("dblestatefour_10",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_11 = registerBlock("dblestatefour_11",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // DOUBLE THREE ESTATE
    public static final RegistryObject<Block> DBLESTATETHREE_1 = registerBlock("dblestatethree_1",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_2 = registerBlock("dblestatethree_2",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_3 = registerBlock("dblestatethree_3",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_4 = registerBlock("dblestatethree_4",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_5 = registerBlock("dblestatethree_5",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_6 = registerBlock("dblestatethree_6",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_7 = registerBlock("dblestatethree_7",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_8 = registerBlock("dblestatethree_8",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_9 = registerBlock("dblestatethree_9",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_10 = registerBlock("dblestatethree_10",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_11 = registerBlock("dblestatethree_11",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // ANGLED THREE ESTATE
    public static final RegistryObject<Block> ANGESTATETHREE_2 = registerBlock("angestatethree_2",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // ANGLED OPPO THREE ESTATE

    public static final RegistryObject<Block> ANG1ESTATETHREE_2 = registerBlock("ang1estatethree_2",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // ANGLED FOUR ESTATE
    public static final RegistryObject<Block> ANGESTATEFOUR_2 = registerBlock("angestatefour_2",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // ANGLED OPPO FOUR ESTATE

    public static final RegistryObject<Block> ANG1ESTATEFOUR_2 = registerBlock("ang1estatefour_2",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);




    // ENGLISH SWEM SADDLES
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_BLACK = registerBlock("english_saddle_swem_black",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_BROWN = registerBlock("english_saddle_swem_brown",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // BAGS
    public static final RegistryObject<Block> FEED_BAG_1 = registerBlock("feed_bag_1",
            () -> new FeedbagsBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> FEED_BAG_2 = registerBlock("feed_bag_2",
            () -> new FeedbagsBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> FEED_BAG_3 = registerBlock("feed_bag_3",
            () -> new FeedbagsBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> FEED_BAG_4 = registerBlock("feed_bag_4",
            () -> new FeedbagsBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    // HITCHING POST WATER
    public static final RegistryObject<Block> HPW_1 = registerBlock("hpw_1",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_2 = registerBlock("hpw_2",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_3 = registerBlock("hpw_3",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_4 = registerBlock("hpw_4",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_5 = registerBlock("hpw_5",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_6 = registerBlock("hpw_6",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_7 = registerBlock("hpw_7",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_8 = registerBlock("hpw_8",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_9 = registerBlock("hpw_9",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_10 = registerBlock("hpw_10",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> HPW_11 = registerBlock("hpw_11",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);

    //Sweatscrapers
    public static final RegistryObject<Block> BAGEK_SWEATSCRAPER_1 = registerBlock("bagek_sweatscraper_1",
            () -> new SweatScraperBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
