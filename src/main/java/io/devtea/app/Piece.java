package io.devtea.app;

import java.util.Arrays;

class Piece {
	private Location location;
	private String type;

	private static String[] types = { "bar", "leftL", "rightL", "square", "LeftZ", "rightZ", "Nose" };

	public Piece(String type, Location location) {
		setType(type);
		setLocations(location);
	}

	public void translate(int x, int y) {
		location.setX(location.getX() + x);
		location.setY(location.getY() + y);
	}

	public void drawPiece() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (Arrays.asList(types).contains(type))
			this.type = type;
		else
			throw new IllegalArgumentException("The piece must be a valid type");
	}

	public Location getLocations() {
		return location;
	}

	public void setLocations(Location location) {
		this.location = location;
	}
}
