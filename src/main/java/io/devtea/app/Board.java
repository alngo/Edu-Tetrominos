package io.devtea.app;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

class Board extends JComponent {

	private static final int SCALE = 16; // number of pixels per square

	private int cols;
	private int rows;
	private ArrayList<Piece> pieceList;
	private Piece activePiece;

	public Board(final int cols, final int rows) {
		super();
		setPreferredSize(new Dimension(cols * SCALE, rows * SCALE));

		Location[] locations = new Location[4];
		locations[0] = new Location(0, 0);
		locations[1] = new Location(0, 1);
		locations[2] = new Location(1, 0);
		locations[3] = new Location(1, 1);

		activePiece = new Piece(locations);
	}

	public void paintComponent(final Graphics g) {
		// clear the screen with black
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		for (Piece pc : pieceList) {
			pc.drawBlocks(g, SCALE);
		}
	}

	// Move the active piece down one step. Check for collisions.
	// Check for complete rows that can be destroyed.
	public void nextTurn() {
		activePiece.translate(0, -1);
	}

	public void slide(final int dx) {
		activePiece.translate(dx, 0);
		repaint();

	}

	public void rotateRight() {
		// TO DO: rotate the active piece to the right:

		repaint();
	}

	public void rotateLeft() {
		// TO DO: rotate the active piece to the left:
		repaint();
	}

}
