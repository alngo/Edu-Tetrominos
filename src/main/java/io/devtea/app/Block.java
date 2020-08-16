package io.devtea.app;

import java.awt.Color;
import java.awt.Graphics;

class Block {

	public int colorIndex;

	public static Color[] colors = { Color.red, Color.blue, Color.magenta, Color.orange, Color.green, Color.cyan,
			Color.yellow };

	public Block(final int colorIndex) {
		this.colorIndex = colorIndex;
	}

	public void draw(final Graphics g, final int scale, final int x, final int y) {
		int px = x * scale + 1;
		int py = y * scale + 1;
		int size = scale - 2;
		g.setColor(colors[colorIndex]);
		g.fillRect(px, py, size, size);
	}

}
