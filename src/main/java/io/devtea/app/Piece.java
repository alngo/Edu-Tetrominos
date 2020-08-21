package io.devtea.app;

import java.util.ArrayList;
import java.util.Arrays;

class Piece {
    private ArrayList<Block> blockList;
    private static String[] types = { "bar", "square", "rightL", "leftL", "rightZ", "leftZ", "podium" };
    private String type;

    public Piece(String type) {
        setType(type);
    }

    private void setType(String type) {
        if (!Arrays.asList(types).contains(type)) {
            throw new IllegalArgumentException("Invalid type.");
        }
        this.type = type;
    }

    public ArrayList<Block> getBlocks() {
        return blockList;
    }

    public void translate(int x, int y) {
        for (Block block : blockList) {
            block.translate(x, y);
        }
    }
}
