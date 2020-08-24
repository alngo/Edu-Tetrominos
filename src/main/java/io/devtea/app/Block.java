package io.devtea.app;

import java.awt.Color;
import java.awt.Graphics;

class Block {

    public int colorIndex;
    public Location loc;

    public static Color[] colors = { Color.red, Color.blue, Color.magenta, Color.orange, Color.green, Color.cyan,
            Color.yellow };

    public Block() {
        this.colorIndex = 0;
        this.loc = new Location(0, 0);
    }

    public Block(final int colorIndex) {
        this.colorIndex = colorIndex;
        this.loc = new Location(0, 0);
    }

    public Block(final int colorIndex, final int x, final int y) {
        this.colorIndex = colorIndex;
        this.loc = new Location(x, y);
    }

    public void translate(int x, int y) {
        loc.setX(loc.getX() + x);
        loc.setY(loc.getY() + y);
    }

    public void draw(final Graphics g, final int scale) {
        final int px = loc.getX() * scale + 1;
        final int py = loc.getY() * scale + 1;
        final int size = scale - 2;
        g.setColor(colors[colorIndex]);
        g.fillRect(px, py, size, size);
    }
}
