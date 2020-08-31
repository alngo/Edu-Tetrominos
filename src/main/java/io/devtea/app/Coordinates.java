package io.devtea.app;

class Coordinates {
    public int x;
    public int y;
    public int z;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

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
        return new Coordinates(this.x + x, this.y + y, this.z);
    }

    public Coordinates add(int x, int y, int z) {
        return new Coordinates(this.x + x, this.y + y, this.z + z);
    }

    public Coordinates add(int x, int y, boolean inplace) {
        if (!inplace) {
            return this.add(x, y);
        }
        this.x += x;
        this.y += y;
        return this;
    }

    public Coordinates add(int x, int y, int z, boolean inplace) {
        if (!inplace) {
            return this.add(x, y, z);
        }
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Boolean isEqual(Coordinates coord) {
        return coord.x == this.x && coord.y == this.y && coord.z == this.z;
    }
}
