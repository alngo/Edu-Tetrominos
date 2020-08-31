package io.devtea.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.awt.Color;
import java.awt.Graphics;

import org.junit.Test;
import org.mockito.internal.util.Supplier;

public class BlockTest {

    Supplier<Block> defaultBlock = () -> new Block();
    Supplier<Block> colorBlock = () -> new Block(2);
    Supplier<Block> fullBlock = () -> new Block(1, new Coordinates(2, 3));

    @Test
    public void shouldCallSetColor() {
        final Block block = defaultBlock.get();
        final Graphics gMock = mock(Graphics.class);
        final Color expectedColor = Color.red;
        block.draw(gMock, 16);
        verify(gMock).setColor(expectedColor);
    }

    @Test
    public void shouldCallFillRect() {
        final Block block = defaultBlock.get();
        final Graphics gMock = mock(Graphics.class);
        final int expectedPx = 1;
        final int expectedPy = 1;
        final int expectedSize = 14;
        block.draw(gMock, 16);
        verify(gMock).fillRect(expectedPx, expectedPy, expectedSize, expectedSize);
    }

    @Test
    public void shouldInitiateBlockWithDefaultX() {
        final Block block = defaultBlock.get();
        assertEquals(0, block.coord.x);
    }

    @Test
    public void shouldInitiateBlockWithDefaultY() {
        final Block block = defaultBlock.get();
        assertEquals(0, block.coord.y);
    }

    @Test
    public void shouldInitiateBlockWithDefaultColorIndex() {
        final Block block = defaultBlock.get();
        assertEquals(0, block.colorIndex);
    }

    @Test
    public void shouldInitiateBlockWithColorIndex() {
        final Block block = colorBlock.get();
        assertEquals(2, block.colorIndex);
    }

    @Test
    public void shouldInitiateBlockWithColorIndexAndDefaultX() {
        final Block block = colorBlock.get();
        assertEquals(0, block.coord.x);
    }

    @Test
    public void shouldInitiateBlockWithColorIndexAndDefaultY() {
        final Block block = colorBlock.get();
        assertEquals(0, block.coord.y);
    }

    @Test
    public void shouldInitiateWithColor() {
        final Block block = fullBlock.get();
        assertEquals(1, block.colorIndex);
    }

    @Test
    public void shouldInitiateWithX() {
        final Block block = fullBlock.get();
        assertEquals(2, block.coord.x);
    }

    @Test
    public void shouldInitiateWithY() {
        final Block block = fullBlock.get();
        assertEquals(3, block.coord.y);
    }

    @Test
    public void shouldTranslateLocationX() {
        final Block block = defaultBlock.get();
        block.translate(1, 2);
        assertEquals(1, block.coord.x);
    }

    @Test
    public void shouldTranslateLocationY() {
        final Block block = defaultBlock.get();
        block.translate(1, 2);
        assertEquals(2, block.coord.y);
    }
}
