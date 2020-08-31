package io.devtea.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceFactoryTest {
    @Test
    public void shouldReturnNull() {
        Piece piece = PieceFactory.getPiece("qweqwe", new Coordinates());
        assertEquals(null, piece);
    }

    @Test
    public void shouldReturnIPiece() {
        Piece piece = PieceFactory.getPiece("I", new Coordinates());
        assertEquals("IPiece", piece.getClass().getSimpleName());
    }

    @Test
    public void shouldReturnOPiece() {
        Piece piece = PieceFactory.getPiece("O", new Coordinates());
        assertEquals("OPiece", piece.getClass().getSimpleName());
    }

    @Test
    public void shouldReturnJPiece() {
        Piece piece = PieceFactory.getPiece("J", new Coordinates());
        assertEquals("JPiece", piece.getClass().getSimpleName());
    }

    @Test
    public void shouldReturnLPiece() {
        Piece piece = PieceFactory.getPiece("L", new Coordinates());
        assertEquals("LPiece", piece.getClass().getSimpleName());
    }

    @Test
    public void shouldReturnSPiece() {
        Piece piece = PieceFactory.getPiece("S", new Coordinates());
        assertEquals("SPiece", piece.getClass().getSimpleName());
    }

    @Test
    public void shouldReturnZPiece() {
        Piece piece = PieceFactory.getPiece("Z", new Coordinates());
        assertEquals("ZPiece", piece.getClass().getSimpleName());
    }

    @Test
    public void shouldReturnTPiece() {
        Piece piece = PieceFactory.getPiece("T", new Coordinates());
        assertEquals("TPiece", piece.getClass().getSimpleName());
    }
}
