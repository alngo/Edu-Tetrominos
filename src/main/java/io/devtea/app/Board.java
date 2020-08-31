package io.devtea.app;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

class Board extends JComponent {

    /**
     *
     */
    private static final long serialVersionUID = 8062754050531059808L;

    private static final int SCALE = 16; // number of pixels per square

    private final int cols;
    private final int rows;
    private ArrayList<Block> blockList;
    private Piece activePiece;

    public Board(final int cols, final int rows) {
        super();
        this.cols = cols;
        this.rows = rows;
        this.blockList = new ArrayList<Block>();
        this.activePiece = null;
        setPreferredSize(new Dimension(cols * SCALE, rows * SCALE));
    }

    public void eraseScreen(final Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void paintBlocks(final Graphics g) {
        for (Block block : blockList) {
            block.draw(g, SCALE);
        }
    }

    public void paintComponent(final Graphics g) {
        eraseScreen(g);
        paintBlocks(g);
    }

    // Move the active piece down one step.
    // Check for collisions.
    // Check for complete rows that can be destroyed.
    public void tick() {
        if (activePiece == null) {
            activePiece = PieceFactory.getPiece("I", new Coordinates(cols / 2, 0));
            blockList.addAll(activePiece.getBlocks());
        }
        // checkColision
        activePiece.translate(0, 1);
    }

    public void slide(final int dx) {
        // checkColision
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

    public static int getScale() {
        return SCALE;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public ArrayList<Block> getBlockList() {
        return blockList;
    }

    public Piece getActivePiece() {
        return activePiece;
    }
}
