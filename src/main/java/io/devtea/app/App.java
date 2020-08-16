package io.devtea.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

// The class that sets up the user interface
// for the Tetrominos game. You will not need to
// edit this file, but it might be worth reading through it.

class App {

	private static void createAndShowGUI() {
		// Create and set up the window.
		final JFrame frame = new JFrame("Tetrominos!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final Board board = new Board(16, 32);

		frame.getContentPane().add(board);

		// Display the window.
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);

		final Timer timer = new Timer(300, new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				board.nextTurn();
			}
		});

		frame.addKeyListener(new KeyListener() {
			public void keyPressed(final KeyEvent e) {
				final int key = e.getKeyCode();
				// System.out.println("key pressed " + e.getKeyCode());
				if (key == KeyEvent.VK_D) {
					board.rotateLeft();
				} else if (key == KeyEvent.VK_G) {
					board.rotateRight();
				} else if (key == KeyEvent.VK_S) {
					board.slide(-1);
				} else if (key == KeyEvent.VK_F) {
					board.slide(1);
				}
			}

			@Override
			public void keyTyped(final KeyEvent e) {
			}

			@Override
			public void keyReleased(final KeyEvent e) {
			}
		});

		timer.start();
	}

	public static void main(final String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
