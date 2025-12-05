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

    public static final VoxelShape CLOSED_EAST = Shapes.or(
            Block.box(14, 0, 0, 16, 24, 16)
    );

    public static final VoxelShape CLOSED_NORTH = Shapes.or(
            Block.box(0, 0, 0, 16, 24, 2)
    );

    public static final VoxelShape CLOSED_SOUTH = Shapes.or(
            Block.box(0, 0, 14, 16, 24, 16)
    );

    public static final VoxelShape CLOSED_WEST = Shapes.or(
            Block.box(0, 0, 0, 2, 24, 16)
    );

    // ---------- OPEN SHAPES ----------

    public static final VoxelShape OPEN_EAST = Shapes.or(
            Block.box(0, 0, -16, 16, 24, -14)
    );

    public static final VoxelShape OPEN_NORTH = Shapes.or(
            Block.box(-16, 0, 0, -14, 24, 16)
    );

    public static final VoxelShape OPEN_SOUTH = Shapes.or(
            Block.box(30, 0, 0, 32, 24, 16)
    );

    public static final VoxelShape OPEN_WEST = Shapes.or(
            Block.box(0, 0, 30, 16, 24, 32)
    );

    public RightGateBlock(Properties pProperties) {
        super(BlockBehaviour.Properties
                .of(net.minecraft.world.level.material.Material.WOOD)
                .strength(2.0F)
                .sound(SoundType.WOOD)
                .noOcclusion() // lets it be seen through when open
        );

        this.registerDefaultState(this.stateDefinition.any()
                .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
                .setValue(BlockStateProperties.OPEN, false)

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
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world,
                                        BlockPos pos, CollisionContext context) {

        if (state.getValue(OPEN)) {
            return Shapes.empty();
        }

        Direction dir = state.getValue(FACING);
        return switch (dir) {
            case NORTH -> CLOSED_NORTH;
            case SOUTH -> CLOSED_SOUTH;
            case WEST -> CLOSED_WEST;
            default -> CLOSED_EAST;
        };
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, net.minecraft.core.BlockPos pos, CollisionContext ctx) {
        Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        boolean open = state.getValue(BlockStateProperties.OPEN);

        return switch (dir) {
            case NORTH -> open ? OPEN_NORTH : CLOSED_NORTH;
            case SOUTH -> open ? OPEN_SOUTH : CLOSED_SOUTH;
            case WEST -> open ? OPEN_WEST : CLOSED_WEST;
            default -> open ? OPEN_EAST : CLOSED_EAST; // EAST
        };
    }
}

