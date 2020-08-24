package io.devtea.app;

import java.util.ArrayList;

class IPiece extends Piece {
    public IPiece(Coordinate xy) {
        super.setBlocks(forgeBlocks(xy));
    }

    protected ArrayList<Block> forgeBlocks(Coordinate xy) {
        ArrayList<Block> blocks = new ArrayList<Block>();

        blocks.add(new Block(0, xy.x, xy.y));
        blocks.add(new Block(0, xy.x + 1, xy.y));
        blocks.add(new Block(0, xy.x + 2, xy.y));
        blocks.add(new Block(0, xy.x + 3, xy.y));

        return blocks;
    }
}
