package io.devtea.app;

import java.util.ArrayList;

abstract class Piece implements Translatable {
    private ArrayList<Block> blocks;

    public Piece(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void translate(int x, int y) {
        for (Block block : blocks) {
            block.translate(x, y);
        }
    }
}
