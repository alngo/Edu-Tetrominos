package io.devtea.app;

import java.util.ArrayList;

class Piece implements Translatable {
    private ArrayList<Block> blocks;

    public Piece(Coordinates coord) {
        this.blocks = forgeBlocks(coord);
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    protected ArrayList<Block> forgeBlocks(Coordinates coord) {
        ArrayList<Block> blocks = new ArrayList<Block>();
        blocks.add(new Block(0, coord));
        return blocks;
    }

    public void translate(int x, int y) {
        for (Block block : blocks) {
            block.translate(x, y);
        }
    }
}
