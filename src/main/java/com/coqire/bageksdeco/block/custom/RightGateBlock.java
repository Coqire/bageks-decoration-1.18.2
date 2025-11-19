package com.coqire.bageksdeco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

import static net.minecraft.world.level.block.LecternBlock.SHAPE_EAST;
import static net.minecraft.world.level.block.LecternBlock.SHAPE_WEST;

public class RightGateBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;


    private static final VoxelShape CLOSED_SHAPE =
            Block.box(-16, 0, -16, 32, 24.5, -13.5);

    private static final VoxelShape OPEN_SHAPE =
            Block.box(-16, 0, -16, -13.5, 24.5, 32);


    public RightGateBlock(Properties pProperties) {
        super(BlockBehaviour.Properties
                .of(net.minecraft.world.level.material.Material.WOOD)
                .strength(2.0F)
                .sound(SoundType.WOOD)
                .noOcclusion() // lets it be seen through when open
        );

        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(FACING, Direction.NORTH)
                        .setValue(OPEN, false)
        );
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(OPEN, false);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {

        boolean open = state.getValue(OPEN);
        BlockState newState = state.setValue(OPEN, !open);

        level.setBlock(pos, newState, 3);

        return InteractionResult.sidedSuccess(level.isClientSide);

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN);
    }

    @Override
    public VoxelShape getShape(BlockState state, net.minecraft.world.level.BlockGetter world,
                               BlockPos pos, CollisionContext context) {

            if (!state.getValue(OPEN))
                return CLOSED_SHAPE;
            return OPEN_SHAPE;

        };

    }

