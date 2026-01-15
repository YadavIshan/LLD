package SOLID.OCP.Example6;

public class Pawn extends Piece {

    public Pawn(PieceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // Cannot kill own piece
        if (end.isOccupied() && end.getPiece().getColor() == this.color) {
            return false;
        }

        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // White moves up (x+1), Black moves down (x-1)
        int direction = (this.color == PieceColor.WHITE) ? 1 : -1;
        int startRow = (this.color == PieceColor.WHITE) ? 1 : 6;

        // 1. Move Forward (1 step)
        if (startY == endY && endX == startX + direction) {
            return !end.isOccupied(); // Must be empty
        }

        // 2. Move Forward (2 steps) - Only if at startRow
        if (startY == endY && endX == startX + (2 * direction)) {
            if (startX == startRow) {
                // Must be empty at 1 step AND 2 step
                Spot midSpot = board.getSpot(startX + direction, startY);
                return !midSpot.isOccupied() && !end.isOccupied();
            }
            return false;
        }

        // 3. Diagonal Capture
        if (Math.abs(startY - endY) == 1 && endX == startX + direction) {
            // Must have ENEMY piece
            return end.isOccupied() && end.getPiece().getColor() != this.color;
        }

        return false;
    }
}
