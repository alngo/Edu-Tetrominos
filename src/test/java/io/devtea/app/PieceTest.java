package io.devtea.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.function.Supplier;

import org.junit.Test;

public class PieceTest {

    private Supplier<Coordinates> baseCoord = () -> new Coordinates(0, 0);
    private Supplier<Piece> basePiece = () -> {
        Piece piece = new Piece(baseCoord.get());
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

    @Test
    public void shouldBeAIPiece() {
        Piece piece = new IPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(0, 1)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(0, 2)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(0, 3)));
    }

    @Test
    public void shouldBeAOPiece() {
        Piece piece = new OPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(1, 0)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(0, 1)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(1, 1)));
    }

    @Test
    public void shouldBeAJPiece() {
        Piece piece = new JPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(0, 1)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(0, 2)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(-1, 2)));
    }

    @Test
    public void shouldBeALPiece() {
        Piece piece = new LPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(0, 1)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(0, 2)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(1, 2)));
    }

    @Test
    public void shouldBeASPiece() {
        Piece piece = new SPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(1, 0)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(0, 1)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(-1, 1)));
    }

    @Test
    public void shouldBeAZPiece() {
        Piece piece = new ZPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(-1, 0)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(0, 1)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(1, 1)));
    }

    @Test
    public void shouldBeATPiece() {
        Piece piece = new TPiece(baseCoord.get());
        ArrayList<Block> blocks = piece.getBlocks();
        assertTrue(blocks.get(0).coord.isEqual(new Coordinates(0, 0)));
        assertTrue(blocks.get(1).coord.isEqual(new Coordinates(-1, 0)));
        assertTrue(blocks.get(2).coord.isEqual(new Coordinates(1, 0)));
        assertTrue(blocks.get(3).coord.isEqual(new Coordinates(0, 1)));
    }
}
