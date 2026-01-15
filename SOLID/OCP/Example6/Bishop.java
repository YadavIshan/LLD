package SOLID.OCP.Example6;

public class Bishop extends Piece {

    public Bishop(PieceColor color) {
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

        // 2. Verify diagonal movement
        if (Math.abs(startX - endX) != Math.abs(startY - endY)) {
            return false;
        }

        // 3. Path check
        int xDir = endX > startX ? 1 : -1;
        int yDir = endY > startY ? 1 : -1;

        int currentX = startX + xDir;
        int currentY = startY + yDir;

        while (currentX != endX && currentY != endY) {
            if (board.getSpot(currentX, currentY).isOccupied()) {
                return false;
            }
            currentX += xDir;
            currentY += yDir;
        }

        return true;
    }
}
