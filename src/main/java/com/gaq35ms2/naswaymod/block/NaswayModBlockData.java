package com.gaq35ms2.naswaymod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class NaswayModBlockData {
    /*
    * Дабы сделать свой код более читаемым, я перенёс инфу о блоках сюда
    */

    public static final Block Nasway_block = new Block(Block.Settings.copy(Blocks.DIRT)
                    .mapColor(MapColor.GREEN)
                    .strength(0.4f,2f)
                    .sounds(BlockSoundGroup.GRASS));
    public static final Block Nasway_Elite_block = new Block(Block.Settings.copy(Blocks.GOLD_BLOCK)
            .sounds(BlockSoundGroup.GRAVEL));
}
