package SOLID.OCP.Example6;

public class Board {
    private final Spot[][] spots = new Spot[8][8];

    public Board() {
        resetBoard();
    }

    public Spot getSpot(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new IllegalArgumentException("Coordinates out of bounds");
        }
        return spots[x][y];
    }

    // Initialize the board for a new game
    public void resetBoard() {
        // Initialize empty spots first
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                spots[i][j] = new Spot(i, j, null);
            }
        }

        // Board initialized to empty spots. Piece placement handles elsewhere.
    }
}
