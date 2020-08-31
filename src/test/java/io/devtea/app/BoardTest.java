package io.devtea.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import javax.swing.JComponent;

import org.junit.Test;

public class BoardTest {
    JComponent component = mock(JComponent.class);

    @Test
    public void shouldAssignColsAndRows() {
        Board board = new Board(42, 24);
        assertEquals(42, board.getCols());
        assertEquals(24, board.getRows());
    }

    @Test
    public void shouldCallSetPreferredSize() {
        Board board = new Board(16, 32);
        assertEquals(16 * Board.getScale(), board.getWidth());
        assertEquals(32 * Board.getScale(), board.getHeight());
    }

    @Test
    public void shouldInitBlockList() {
        Board board = new Board(42, 24);
        assertNotNull(board.getBlockList());
    }

    @Test
    public void shouldInitiateActivePiece() {
        Board board = new Board(16, 32);
        board.tick();
        assertNotNull(board.getActivePiece());
    }

    @Test
    public void shouldAddBlocksToBlockList() {
        Board board = new Board(16, 32);
        board.tick();
        assertEquals(4, board.getBlockList().size());
    }

    @Test
    public void shouldTranslateActivePiece() {
        Board board = new Board(16, 32);
        board.tick();
        Coordinates startCoord = board.getActivePiece().getBlocks().get(0).coord;
        board.tick();
        Coordinates endCoord = board.getActivePiece().getBlocks().get(0).coord;
        assertTrue(startCoord.add(0, 1, true).isEqual(endCoord));
    }

    @Test
    public void shouldSlideActivePiece() {
        Board board = new Board(16, 32);
        board.tick();
        Coordinates startCoord = board.getActivePiece().getBlocks().get(0).coord;
        board.slide(1);
        Coordinates endCoord = board.getActivePiece().getBlocks().get(0).coord;
        assertTrue(startCoord.add(1, 0, true).isEqual(endCoord));
    }
}
