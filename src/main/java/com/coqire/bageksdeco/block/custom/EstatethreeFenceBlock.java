package com.coqire.bageksdeco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class EstatethreeFenceBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public EstatethreeFenceBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE_NORTH = Stream.of(
            Block.box(-13, 2.5, 0.5, 29, 4.5, 2.5),
            Block.box(-13.5, 11.5, 0.5, 32, 13.5, 2.5),
            Block.box(-13, 20.5, 0.5, 29, 22.5, 2.5),
            Block.box(-16, 0, 0, -13, 24.5, 3),
            Block.box(29, 0, 0, 32, 24.5, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_EAST =Stream.of(
            Block.box(13.5, 2.5, -12.5, 15.5, 4.5, 29.5),
            Block.box(13.5, 11.5, -15.5, 15.5, 13.5, 30),
            Block.box(13.5, 20.5, -12.5, 15.5, 22.5, 29.5),
            Block.box(13, 0, 28.5, 16, 24.5, 31.5),
            Block.box(13, 0, -15.5, 16, 24.5, -12.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_SOUTH = Stream.of(
            Block.box(-13, 2.5, 13.5, 29, 4.5, 15.5),
            Block.box(-13.5, 11.5, 13.5, 32, 13.5, 15.5),
            Block.box(-13, 20.5, 13.5, 29, 22.5, 15.5),
            Block.box(-16, 0, 13, -13, 24.5, 16),
            Block.box(29, 0, 13, 32, 24.5, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WEST = Stream.of(
            Block.box(0.5, 2.5, -12.5, 2.5, 4.5, 29.5),
            Block.box(0.5, 11.5, -15.5, 2.5, 13.5, 30),
            Block.box(0.5, 20.5, -12.5, 2.5, 22.5, 29.5),
            Block.box(0, 0, 28.5, 3, 24.5, 31.5),
            Block.box(0, 0, -15.5, 3, 24.5, -12.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_UP = Stream.of(
            Block.box(-13, 2.5, 0.5, 29, 4.5, 2.5),
            Block.box(-13.5, 11.5, 0.5, 32, 13.5, 2.5),
            Block.box(-13, 20.5, 0.5, 29, 22.5, 2.5),
            Block.box(-16, 0, 0, -13, 24.5, 3),
            Block.box(29, 0, 0, 32, 24.5, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_DOWN = Stream.of(
            Block.box(-13, 2.5, 0.5, 29, 4.5, 2.5),
            Block.box(-13.5, 11.5, 0.5, 32, 13.5, 2.5),
            Block.box(-13, 20.5, 0.5, 29, 22.5, 2.5),
            Block.box(-16, 0, 0, -13, 24.5, 3),
            Block.box(29, 0, 0, 32, 24.5, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(BlockStateProperties.FACING)) {
            case DOWN -> SHAPE_DOWN;
            case UP -> SHAPE_UP;
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case WEST -> SHAPE_WEST;
            case EAST -> SHAPE_EAST;
        };
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, context.getNearestLookingDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }
}
