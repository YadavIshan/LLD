package SOLID.OCP.Example6;

public class Rook extends Piece {

    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // 1. Target check
        if (end.isOccupied() && end.getPiece().getColor() == this.color) {
            return false;
        }

        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // 2. Geometry check: Linear (Row or Column)
        if (startX != endX && startY != endY) {
            return false;
        }

        // 3. Path check
        // Moving Horizontal
        if (startY == endY) {
            int minX = Math.min(startX, endX);
            int maxX = Math.max(startX, endX);
            for (int i = minX + 1; i < maxX; i++) {
                if (board.getSpot(i, startY).isOccupied()) {
                    return false;
                }
            }
        }
        // Moving Vertical
        else {
            int minY = Math.min(startY, endY);
            int maxY = Math.max(startY, endY);
            for (int i = minY + 1; i < maxY; i++) {
                if (board.getSpot(startX, i).isOccupied()) {
                    return false;
                }
            }
        }

        return true;
    }
}
