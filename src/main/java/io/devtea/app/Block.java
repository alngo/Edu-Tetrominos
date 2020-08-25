package io.devtea.app;

import java.awt.Color;
import java.awt.Graphics;

class Block {

    public int colorIndex;
    public Coordinates coord;

    public static Color[] colors = { Color.red, Color.blue, Color.magenta, Color.orange, Color.green, Color.cyan,
            Color.yellow };

    public Block() {
        this.colorIndex = 0;
        this.coord = new Coordinates(0, 0);
    }

    public Block(final int colorIndex) {
        this.colorIndex = colorIndex;
        this.coord = new Coordinates(0, 0);
    }

    public Block(final int colorIndex, Coordinates coord) {
        this.colorIndex = colorIndex;
        this.coord = new Coordinates(x, y);
    }

    public void translate(int x, int y) {
        coord.x = coord.x + x;
        coord.y = coord.y + y;
    }

    public void draw(final Graphics g, final int scale) {
        final int px = coord.x * scale + 1;
        final int py = coord.y * scale + 1;
        final int size = scale - 2;
        g.setColor(colors[colorIndex]);
        g.fillRect(px, py, size, size);
    }
}
