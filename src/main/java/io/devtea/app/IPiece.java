package io.devtea.app;

import java.util.ArrayList;

class IPiece extends Piece {
    public IPiece(Coordinatess coord) {
        super.setBlocks(forgeBlocks(coord));
    }

    protected ArrayList<Block> forgeBlocks(Coordinatess coord) {
        ArrayList<Block> blocks = new ArrayList<Block>();

        blocks.add(new Block(0, coord));
        blocks.add(new Block(0, coord.add(1, 0)));
        blocks.add(new Block(0, coord.add(2, 0)));
        blocks.add(new Block(0, coord.add(3, 0)));

        return blocks;
    }
}
