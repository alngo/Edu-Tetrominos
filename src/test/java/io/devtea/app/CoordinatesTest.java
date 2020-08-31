package io.devtea.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoordinatesTest {
    @Test
    public void shouldInitiateWithDefaultValue() {
        final Coordinates coord = new Coordinates();
        assertEquals(0, coord.x);
        assertEquals(0, coord.y);
        assertEquals(0, coord.z);
    }

    @Test
    public void shouldInitiateXY() {
        final Coordinates coord = new Coordinates(1, 2);
        assertEquals(1, coord.x);
        assertEquals(2, coord.y);
        assertEquals(0, coord.z);
    }

    @Test
    public void shouldInitiateXYZ() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        assertEquals(1, coord.x);
        assertEquals(2, coord.y);
        assertEquals(3, coord.z);
    }

    @Test
    public void shouldReturnNewAddedCoordinateXY() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        Coordinates nextCoord = coord.add(10, 5);
        assertEquals(11, nextCoord.x);
        assertEquals(7, nextCoord.y);
        assertEquals(3, nextCoord.z);
    }

    @Test
    public void shouldReturnNewAddedCoordinateXYZ() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        Coordinates nextCoord = coord.add(13, 52, 23);
        assertEquals(14, nextCoord.x);
        assertEquals(54, nextCoord.y);
        assertEquals(26, nextCoord.z);
    }

    @Test
    public void shouldAddInplaceXY() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        coord.add(13, 52, true);
        assertEquals(14, coord.x);
        assertEquals(54, coord.y);
        assertEquals(3, coord.z);
    }

    @Test
    public void shouldAddInplaceXYZ() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        coord.add(13, 52, 23, true);
        assertEquals(14, coord.x);
        assertEquals(54, coord.y);
        assertEquals(26, coord.z);
    }

    @Test
    public void shouldNotChangeInPlaceXY() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        coord.add(13, 52, false);
        assertEquals(1, coord.x);
        assertEquals(2, coord.y);
        assertEquals(3, coord.z);
    }

    @Test
    public void shouldNotChangeInplaceXYZ() {
        final Coordinates coord = new Coordinates(1, 2, 3);
        coord.add(13, 52, 23, false);
        assertEquals(1, coord.x);
        assertEquals(2, coord.y);
        assertEquals(3, coord.z);
    }
}
