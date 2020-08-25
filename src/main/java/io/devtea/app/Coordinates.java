package io.devtea.app;

class Coordinates {
    public int x;
    public int y;
    public int z;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Coordinates add(int x, int y) {
        return new Coordinates(this.x + x, this.y + y);
    }

    public Coordinates add(int x, int y, int z) {
        return new Coordinates(this.x + x, this.y + y, this.z + z);
    }

}
