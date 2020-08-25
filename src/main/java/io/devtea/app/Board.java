package io.devtea.app;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

class Board extends JComponent {

    private static final int SCALE = 16; // number of pixels per square

    private final int cols;
    private final int rows;
    private ArrayList<Block> blockList;

    public Board(final int cols, final int rows) {
        super();
        this.cols = cols;
        this.rows = rows;
        setPreferredSize(new Dimension(cols * SCALE, rows * SCALE));
        blockList = new ArrayList<Block>();
        Coordinates coord = new Coordinates(5, 5);
        blockList.add(new Block(0, coord));
    }

    public void paintComponent(final Graphics g) {
        // clear the screen with black
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (Block block : blockList) {
            block.draw(g, SCALE);
        }
    }

    // Move the active piece down one step. Check for collisions.
    // Check for complete rows that can be destroyed.
    public void nextTurn() {
        // activePiece.translate(0, -1);
    }

    public void slide(final int dx) {
        // activePiece.translate(dx, 0);
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
