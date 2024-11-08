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

public class EstatefourC1FenceBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public EstatefourC1FenceBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE_NORTH = Stream.of(
            Block.box(-14, 2.5, 7, 13, 22.5, 9),
            Block.box(-16, 0, 6.5, -13, 24.5, 9.5),
            Block.box(13, 0, 6.5, 16, 24.5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_EAST =Stream.of(
            Block.box(7, 2.5, -13, 9, 22.5, 14),
            Block.box(6.5, 0, 13, 9.5, 24.5, 16),
            Block.box(6.5, 0, -16, 9.5, 24.5, -13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_SOUTH = Stream.of(
            Block.box(2, 2.5, 7, 29, 22.5, 9),
            Block.box(0, 0, 6.5, 3, 24.5, 9.5),
            Block.box(29, 0, 6.5, 32, 24.5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WEST = Stream.of(
            Block.box(7, 2.5, 3, 9, 22.5, 30),
            Block.box(6.5, 0, 29, 9.5, 24.5, 32),
            Block.box(6.5, 0, 0, 9.5, 24.5, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_UP = Stream.of(
            Block.box(-14, 2.5, 7, 13, 22.5, 9),
            Block.box(-16, 0, 6.5, -13, 24.5, 9.5),
            Block.box(13, 0, 6.5, 16, 24.5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_DOWN = Stream.of(
            Block.box(-14, 2.5, 7, 13, 22.5, 9),
            Block.box(-16, 0, 6.5, -13, 24.5, 9.5),
            Block.box(13, 0, 6.5, 16, 24.5, 9.5)
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
