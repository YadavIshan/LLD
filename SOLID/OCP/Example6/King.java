package SOLID.OCP.Example6;

public class King extends Piece {

    public King(PieceColor color) {
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

        // Logic: Max 1 step in any direction
        return x <= 1 && y <= 1 && !(x == 0 && y == 0);
    }
}
