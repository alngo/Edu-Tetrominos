package io.devtea.app;

import java.util.ArrayList;

class Piece {
	private ArrayList<Location> locations;

	public Piece(ArrayList<Location> locations) {
		setLocations(locations);
	}

	public void translate(int x, int y) {
		for (Location loc : locations) {
			loc.setX(loc.getX() + x);
			loc.setY(loc.getY() + y);
		}
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}
}
