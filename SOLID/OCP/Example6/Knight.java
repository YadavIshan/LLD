package SOLID.OCP.Example6;

public class Knight extends Piece {

    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // Can't move to a spot occupied by your own piece
        if (end.isOccupied() && end.getPiece().getColor() == this.color) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        // Check for L-shape movement (2x1 or 1x2)
        return x * y == 2;
    }
}
