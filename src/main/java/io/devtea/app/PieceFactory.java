package io.devtea.app;

import java.util.ArrayList;

class PieceFactory {
    public Piece getPiece(String type, Coordinate xy) {
        switch (type) {
            case "I":
                return new IPiece(xy);
            default:
                return null;
        }
    }

}
