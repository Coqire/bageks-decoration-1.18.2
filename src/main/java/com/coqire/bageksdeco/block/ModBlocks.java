package com.coqire.bageksdeco.block;
import com.coqire.bageksdeco.bageksdeco;

import com.coqire.bageksdeco.block.custom.*;

import com.coqire.bageksdeco.item.DecoCreativeModeTab;
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

import static com.coqire.bageksdeco.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, bageksdeco.Mod_ID);

    //CROSSBUCKS
    public static final RegistryObject<Block> CROSSBUCK_1 = registerBlock("crossbuck_1",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_2 = registerBlock("crossbuck_2",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_3 = registerBlock("crossbuck_3",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_4 = registerBlock("crossbuck_4",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_5 = registerBlock("crossbuck_5",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_6 = registerBlock("crossbuck_6",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_7 = registerBlock("crossbuck_7",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_8 = registerBlock("crossbuck_8",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_9 = registerBlock("crossbuck_9",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_10 = registerBlock("crossbuck_10",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSBUCK_11 = registerBlock("crossbuck_11",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

//CROSSESTATES
    public static final RegistryObject<Block> CROSSESTATE_1 = registerBlock("crossestate_1",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_2 = registerBlock("crossestate_2",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_3 = registerBlock("crossestate_3",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_4 = registerBlock("crossestate_4",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_5 = registerBlock("crossestate_5",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_6 = registerBlock("crossestate_6",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_7 = registerBlock("crossestate_7",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_8 = registerBlock("crossestate_8",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_9 = registerBlock("crossestate_9",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_10 = registerBlock("crossestate_10",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> CROSSESTATE_11 = registerBlock("crossestate_11",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    //ESTATETHREE
    public static final RegistryObject<Block> ESTATETHREE_1 = registerBlock("estatethree_1",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_2 = registerBlock("estatethree_2",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_3 = registerBlock("estatethree_3",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_4 = registerBlock("estatethree_4",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_5 = registerBlock("estatethree_5",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_6 = registerBlock("estatethree_6",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_7 = registerBlock("estatethree_7",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_8 = registerBlock("estatethree_8",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_9 = registerBlock("estatethree_9",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_10 = registerBlock("estatethree_10",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATETHREE_11 = registerBlock("estatethree_11",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    //ESTATEFOUR
    public static final RegistryObject<Block> ESTATEFOUR_1 = registerBlock("estatefour_1",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_2 = registerBlock("estatefour_2",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_3 = registerBlock("estatefour_3",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_4 = registerBlock("estatefour_4",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_5 = registerBlock("estatefour_5",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_6 = registerBlock("estatefour_6",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_7 = registerBlock("estatefour_7",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_8 = registerBlock("estatefour_8",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_9 = registerBlock("estatefour_9",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_10 = registerBlock("estatefour_10",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ESTATEFOUR_11 = registerBlock("estatefour_11",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    //DOUBLE FOUR ESTATE
    public static final RegistryObject<Block> DBLESTATEFOUR_1 = registerBlock("dblestatefour_1",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_2 = registerBlock("dblestatefour_2",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_3 = registerBlock("dblestatefour_3",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_4 = registerBlock("dblestatefour_4",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_5 = registerBlock("dblestatefour_5",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_6 = registerBlock("dblestatefour_6",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_7 = registerBlock("dblestatefour_7",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_8 = registerBlock("dblestatefour_8",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_9 = registerBlock("dblestatefour_9",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_10 = registerBlock("dblestatefour_10",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATEFOUR_11 = registerBlock("dblestatefour_11",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    // DOUBLE THREE ESTATE
    public static final RegistryObject<Block> DBLESTATETHREE_1 = registerBlock("dblestatethree_1",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_2 = registerBlock("dblestatethree_2",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_3 = registerBlock("dblestatethree_3",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_4 = registerBlock("dblestatethree_4",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_5 = registerBlock("dblestatethree_5",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_6 = registerBlock("dblestatethree_6",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_7 = registerBlock("dblestatethree_7",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_8 = registerBlock("dblestatethree_8",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_9 = registerBlock("dblestatethree_9",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_10 = registerBlock("dblestatethree_10",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> DBLESTATETHREE_11 = registerBlock("dblestatethree_11",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    // ANGLED THREE ESTATE
    public static final RegistryObject<Block> ANGESTATETHREE_1 = registerBlock("angestatethree_1",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_2 = registerBlock("angestatethree_2",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_3 = registerBlock("angestatethree_3",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_4 = registerBlock("angestatethree_4",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_5 = registerBlock("angestatethree_5",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_6 = registerBlock("angestatethree_6",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_7 = registerBlock("angestatethree_7",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_8 = registerBlock("angestatethree_8",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_9 = registerBlock("angestatethree_9",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_10 = registerBlock("angestatethree_10",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATETHREE_11 = registerBlock("angestatethree_11",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);


    // ANGLED OPPO THREE ESTATE

    public static final RegistryObject<Block> ANG1ESTATETHREE_1 = registerBlock("ang1estatethree_1",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_2 = registerBlock("ang1estatethree_2",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_3 = registerBlock("ang1estatethree_3",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_4 = registerBlock("ang1estatethree_4",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_5 = registerBlock("ang1estatethree_5",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_6 = registerBlock("ang1estatethree_6",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_7 = registerBlock("ang1estatethree_7",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_8 = registerBlock("ang1estatethree_8",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_9 = registerBlock("ang1estatethree_9",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_10 = registerBlock("ang1estatethree_10",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATETHREE_11 = registerBlock("ang1estatethree_11",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    // ANGLED FOUR ESTATE
    public static final RegistryObject<Block> ANGESTATEFOUR_1 = registerBlock("angestatefour_1",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_2 = registerBlock("angestatefour_2",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_3 = registerBlock("angestatefour_3",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_4 = registerBlock("angestatefour_4",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_5 = registerBlock("angestatefour_5",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_6 = registerBlock("angestatefour_6",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_7 = registerBlock("angestatefour_7",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_8 = registerBlock("angestatefour_8",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_9 = registerBlock("angestatefour_9",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_10 = registerBlock("angestatefour_10",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANGESTATEFOUR_11 = registerBlock("angestatefour_11",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    // ANGLED OPPO FOUR ESTATE

    public static final RegistryObject<Block> ANG1ESTATEFOUR_1 = registerBlock("ang1estatefour_1",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_2 = registerBlock("ang1estatefour_2",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_3 = registerBlock("ang1estatefour_3",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_4 = registerBlock("ang1estatefour_4",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_5 = registerBlock("ang1estatefour_5",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_6 = registerBlock("ang1estatefour_6",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_7 = registerBlock("ang1estatefour_7",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_8 = registerBlock("ang1estatefour_8",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_9 = registerBlock("ang1estatefour_9",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_10 = registerBlock("ang1estatefour_10",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ANG1ESTATEFOUR_11 = registerBlock("ang1estatefour_11",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    //LEFT GATES
    public static final RegistryObject<Block> LGATEONE_1 = registerBlock("lgateone_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_2 = registerBlock("lgateone_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_3 = registerBlock("lgateone_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_4 = registerBlock("lgateone_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_5 = registerBlock("lgateone_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_6 = registerBlock("lgateone_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_7 = registerBlock("lgateone_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_8 = registerBlock("lgateone_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_9 = registerBlock("lgateone_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_10 = registerBlock("lgateone_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEONE_11 = registerBlock("lgateone_11",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> LGATETWO_1 = registerBlock("lgatetwo_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_2 = registerBlock("lgatetwo_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_3 = registerBlock("lgatetwo_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_4 = registerBlock("lgatetwo_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_5 = registerBlock("lgatetwo_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_6 = registerBlock("lgatetwo_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_7 = registerBlock("lgatetwo_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_8 = registerBlock("lgatetwo_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_9 = registerBlock("lgatetwo_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_10 = registerBlock("lgatetwo_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETWO_11 = registerBlock("lgatetwo_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> LGATETHREE_1 = registerBlock("lgatethree_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_2 = registerBlock("lgatethree_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_3 = registerBlock("lgatethree_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_4 = registerBlock("lgatethree_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_5 = registerBlock("lgatethree_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_6 = registerBlock("lgatethree_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_7 = registerBlock("lgatethree_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_8 = registerBlock("lgatethree_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_9 = registerBlock("lgatethree_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_10 = registerBlock("lgatethree_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATETHREE_11 = registerBlock("lgatethree_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> LGATEFOUR_1 = registerBlock("lgatefour_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_2 = registerBlock("lgatefour_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_3 = registerBlock("lgatefour_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_4 = registerBlock("lgatefour_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_5 = registerBlock("lgatefour_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_6 = registerBlock("lgatefour_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_7 = registerBlock("lgatefour_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_8 = registerBlock("lgatefour_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_9 = registerBlock("lgatefour_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_10 = registerBlock("lgatefour_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFOUR_11 = registerBlock("lgatefour_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> LGATEFIVE_1 = registerBlock("lgatefive_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_2 = registerBlock("lgatefive_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_3 = registerBlock("lgatefive_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_4 = registerBlock("lgatefive_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_5 = registerBlock("lgatefive_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_6 = registerBlock("lgatefive_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_7 = registerBlock("lgatefive_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_8 = registerBlock("lgatefive_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_9 = registerBlock("lgatefive_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_10 = registerBlock("lgatefive_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> LGATEFIVE_11 = registerBlock("lgatefive_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);



    // RIGHT GATES
    public static final RegistryObject<Block> RGATEONE_1 = registerBlock("rgateone_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_2 = registerBlock("rgateone_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_3 = registerBlock("rgateone_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_4 = registerBlock("rgateone_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_5 = registerBlock("rgateone_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_6 = registerBlock("rgateone_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_7 = registerBlock("rgateone_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_8 = registerBlock("rgateone_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_9 = registerBlock("rgateone_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_10 = registerBlock("rgateone_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEONE_11 = registerBlock("rgateone_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> RGATETWO_1 = registerBlock("rgatetwo_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_2 = registerBlock("rgatetwo_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_3 = registerBlock("rgatetwo_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_4 = registerBlock("rgatetwo_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_5 = registerBlock("rgatetwo_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_6 = registerBlock("rgatetwo_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_7 = registerBlock("rgatetwo_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_8 = registerBlock("rgatetwo_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_9 = registerBlock("rgatetwo_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_10 = registerBlock("rgatetwo_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETWO_11 = registerBlock("rgatetwo_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> RGATETHREE_1 = registerBlock("rgatethree_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_2 = registerBlock("rgatethree_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_3 = registerBlock("rgatethree_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_4 = registerBlock("rgatethree_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_5 = registerBlock("rgatethree_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_6 = registerBlock("rgatethree_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_7 = registerBlock("rgatethree_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_8 = registerBlock("rgatethree_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_9 = registerBlock("rgatethree_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_10 = registerBlock("rgatethree_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATETHREE_11 = registerBlock("rgatethree_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> RGATEFOUR_1 = registerBlock("rgatefour_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_2 = registerBlock("rgatefour_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_3 = registerBlock("rgatefour_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_4 = registerBlock("rgatefour_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_5 = registerBlock("rgatefour_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_6 = registerBlock("rgatefour_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_7 = registerBlock("rgatefour_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_8 = registerBlock("rgatefour_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_9 = registerBlock("rgatefour_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_10 = registerBlock("rgatefour_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFOUR_11 = registerBlock("rgatefour_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    public static final RegistryObject<Block> RGATEFIVE_1 = registerBlock("rgatefive_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_2 = registerBlock("rgatefive_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_3 = registerBlock("rgatefive_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_4 = registerBlock("rgatefive_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_5 = registerBlock("rgatefive_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_6 = registerBlock("rgatefive_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_7 = registerBlock("rgatefive_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_8 = registerBlock("rgatefive_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_9 = registerBlock("rgatefive_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_10 = registerBlock("rgatefive_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> RGATEFIVE_11 = registerBlock("rgatefive_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);






    // ENGLISH SWEM SADDLES
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_1 = registerBlock("english_saddle_swem_1",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_2 = registerBlock("english_saddle_swem_2",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_3 = registerBlock("english_saddle_swem_3",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_4 = registerBlock("english_saddle_swem_4",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    // HITCHING POST WATER
    public static final RegistryObject<Block> HPW_1 = registerBlock("hpw_1",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_2 = registerBlock("hpw_2",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_3 = registerBlock("hpw_3",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_4 = registerBlock("hpw_4",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_5 = registerBlock("hpw_5",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_6 = registerBlock("hpw_6",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_7 = registerBlock("hpw_7",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_8 = registerBlock("hpw_8",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_9 = registerBlock("hpw_9",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_10 = registerBlock("hpw_10",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);
    public static final RegistryObject<Block> HPW_11 = registerBlock("hpw_11",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);

    //Sweatscrapers
    public static final RegistryObject<Block> BAGEK_SWEATSCRAPER_1 = registerBlock("bagek_sweatscraper_1",
            () -> new SweatScraperBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noOcclusion()),
            DecoCreativeModeTab.BAGEKSFENCE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
