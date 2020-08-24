package io.devtea.app;

import java.util.ArrayList;

abstract class Piece implements Translatable {
    private ArrayList<Block> blocks;

    protected abstract ArrayList<Block> forgeBlocks(Coordinate xy);

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }

    public void translate(int x, int y) {
        for (Block block : blocks) {
            block.translate(x, y);
        }
    }
}
