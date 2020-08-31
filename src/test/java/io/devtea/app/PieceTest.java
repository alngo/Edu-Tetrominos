package io.devtea.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.function.Supplier;

import org.junit.Test;

public class PieceTest {

    Supplier<Piece> basePiece = () -> {
        Coordinates coord = new Coordinates(0, 0);
        Piece piece = new Piece(coord);
        return piece;
    };

    @Test
    public void shouldGetBlocks() {
        Piece piece = basePiece.get();
        ArrayList<Block> blocks = piece.getBlocks();
        assertEquals(1, blocks.size());
    }

    @Test
    public void shouldTranslateBlockCoordX() {
        Piece piece = basePiece.get();
        Block target = piece.getBlocks().get(0);
        piece.translate(1, 0);
        assertEquals(1, target.coord.x);
        assertEquals(0, target.coord.y);
    }

    @Test
    public void shouldTranslateBlockCoordY() {
        Piece piece = basePiece.get();
        Block target = piece.getBlocks().get(0);
        piece.translate(0, 1);
        assertEquals(0, target.coord.x);
        assertEquals(1, target.coord.y);
    }
}
