package io.devtea.app;

import java.awt.Color;
import java.awt.Graphics;

class Block {

    public int colorIndex;
    public Location loc;

    public static Color[] colors = { Color.red, Color.blue, Color.magenta, Color.orange, Color.green, Color.cyan,
            Color.yellow };

    public Block(final int colorIndex, final int x, final int y) {
        this.colorIndex = colorIndex;
        this.loc = new Location(x, y);
    }

    public void draw(final Graphics g, final int scale) {
        final int px = loc.getX() * scale + 1;
        final int py = loc.getY() * scale + 1;
        final int size = scale - 2;
        g.setColor(colors[colorIndex]);
        g.fillRect(px, py, size, size);
    }
}
