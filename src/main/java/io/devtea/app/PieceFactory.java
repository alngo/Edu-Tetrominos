package io.devtea.app;

final class PieceFactory {
    public static final Piece getPiece(String type, Coordinates xy) {
        switch (type) {
            case "I":
                return new IPiece(xy);
            case "O":
                return new OPiece(xy);
            case "J":
                return new JPiece(xy);
            case "L":
                return new LPiece(xy);
            case "S":
                return new SPiece(xy);
            case "Z":
                return new ZPiece(xy);
            case "T":
                return new TPiece(xy);
            default:
                return null;
        }
    }
}
