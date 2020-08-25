package io.devtea.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlockTest {

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
