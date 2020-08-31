package io.devtea.app;

import java.util.ArrayList;

class ZPiece extends Piece {
    public ZPiece(Coordinates coord) {
        super(coord);
    }

    @Override
    protected ArrayList<Block> forgeBlocks(Coordinates coord) {
        ArrayList<Block> blocks = new ArrayList<Block>();

        blocks.add(new Block(0, coord));
        blocks.add(new Block(0, coord.add(-1, 0)));
        blocks.add(new Block(0, coord.add(0, 1)));
        blocks.add(new Block(0, coord.add(1, 1)));

        return blocks;
    }
}
