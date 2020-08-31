package io.devtea.app;

import java.util.ArrayList;

class LPiece extends Piece {
    public LPiece(Coordinates coord) {
        super(coord);
    }

    @Override
    protected ArrayList<Block> forgeBlocks(Coordinates coord) {
        ArrayList<Block> blocks = new ArrayList<Block>();

        blocks.add(new Block(0, coord));
        blocks.add(new Block(0, coord.add(0, 1)));
        blocks.add(new Block(0, coord.add(0, 2)));
        blocks.add(new Block(0, coord.add(1, 2)));

        return blocks;
    }
}
