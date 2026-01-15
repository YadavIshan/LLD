package SOLID.OCP.Example6;

public abstract class Piece {
    protected final PieceColor color;

    public Piece(PieceColor color) {
        this.color = color;
    }

    public PieceColor getColor() {
        return color;
    }

    /**
     * Validates if the move is legal for this piece.
     * 
     * @param board The game board
     * @param start The starting spot
     * @param end   The ending spot
     * @return true if valid
     */
    public abstract boolean canMove(Board board, Spot start, Spot end);
}
