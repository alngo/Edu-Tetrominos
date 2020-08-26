package io.devtea.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.awt.Graphics;
import java.awt.Color;
import static org.mockito.Mockito.*;

public class BlockTest {

    @Test
    public void shouldCallSetColor() {
        Block block = initiateDefault();
        Graphics gMock = mock(Graphics.class);
        Color expectedColor = Color.red;
        block.draw(gMock, 16);
        verify(gMock).setColor(expectedColor);
    }

    @Test
    public void shouldCallFillRect() {
        Block block = initiateDefault();
        Graphics gMock = mock(Graphics.class);
        int expectedPx = 1;
        int expectedPy = 1;
        int expectedSize = 14;
        block.draw(gMock, 16);
        verify(gMock).fillRect(expectedPx, expectedPy, expectedSize, expectedSize);
    }

    @Test
    public void shouldInitiateBlockWithDefaultX() {
        Block block = initiateDefault();
        assertEquals(0, block.coord.x);
    }

    @Test
    public void shouldInitiateBlockWithDefaultY() {
        Block block = initiateDefault();
        assertEquals(0, block.coord.y);
    }

    @Test
    public void shouldInitiateBlockWithDefaultColorIndex() {
        Block block = initiateDefault();
        assertEquals(0, block.colorIndex);
    }

    @Test
    public void shouldInitiateBlockWithColorIndex() {
        Block block = initiateColor();
        assertEquals(2, block.colorIndex);
    }

    @Test
    public void shouldInitiateBlockWithColorIndexAndDefaultX() {
        Block block = initiateColor();
        assertEquals(0, block.coord.x);
    }

    @Test
    public void shouldInitiateBlockWithColorIndexAndDefaultY() {
        Block block = initiateColor();
        assertEquals(0, block.coord.y);
    }

    @Test
    public void shouldInitiateWithColor() {
        Block block = initiateAll();
        assertEquals(1, block.colorIndex);
    }

    @Test
    public void shouldInitiateWithX() {
        Block block = initiateAll();
        assertEquals(2, block.coord.x);
    }

    @Test
    public void shouldInitiateWithY() {
        Block block = initiateAll();
        assertEquals(3, block.coord.y);
    }

    @Test
    public void shouldTranslateLocationX() {
        Block block = initiateDefault();
        block.translate(1, 2);
        assertEquals(1, block.coord.x);
    }

    @Test
    public void shouldTranslateLocationY() {
        Block block = initiateDefault();
        block.translate(1, 2);
        assertEquals(2, block.coord.y);
    }

    /**
     * Helper: initate Block
     */

    public Block initiateDefault() {
        return new Block();
    }

    public Block initiateColor() {
        return new Block(2);
    }

    public Block initiateAll() {
        Coordinates coord = new Coordinates(2, 3);
        return new Block(1, coord);
    }
}
