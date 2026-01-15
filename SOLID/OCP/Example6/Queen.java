package SOLID.OCP.Example6;

public class Queen extends Piece {

    public Queen(PieceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        if (end.isOccupied() && end.getPiece().getColor() == this.color) {
            return false;
        }

        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        boolean isDiagonal = Math.abs(startX - endX) == Math.abs(startY - endY);
        boolean isOrthogonal = (startX == endX) || (startY == endY);

        if (!isDiagonal && !isOrthogonal) {
            return false;
        }

        // Path Check
        int xDir = Integer.compare(endX, startX); // 1, -1, or 0
        int yDir = Integer.compare(endY, startY); // 1, -1, or 0

        int currentX = startX + xDir;
        int currentY = startY + yDir;

        while (currentX != endX || currentY != endY) {
            if (board.getSpot(currentX, currentY).isOccupied()) {
                return false;
            }
            currentX += xDir;
            currentY += yDir;
        }

        return true;
    }
}
