package SOLID.OCP.Example6;

public class TestMain {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Starting Test Simulation...");

        // 1. White Pawn Move (e2 -> e4) (1,4 -> 3,4)
        // Note: My board is 0-indexed. White Pawns at Row 1.
        // Moving from (1, 4) to (3, 4) should be valid (2 steps).
        System.out.println("Test 1: White Pawn (1,4 -> 3,4)");
        boolean r1 = game.playerMove(1, 4, 3, 4);
        System.out.println("Result: " + r1);

        // 2. Black Pawn Move (6,3 -> 5,3)
        System.out.println("Test 2: Black Pawn (6,3 -> 5,3)");
        boolean r2 = game.playerMove(6, 3, 5, 3);
        System.out.println("Result: " + r2);

        // 3. White Knight Move (0,1 -> 2,2)
        System.out.println("Test 3: White Knight (0,1 -> 2,2)");
        boolean r3 = game.playerMove(0, 1, 2, 2);
        System.out.println("Result: " + r3);

        // 4. Invalid Move: Rook Jump (0,0 -> 2,0) with Pawn in way at (1,0)
        System.out.println("Test 4: White Rook Jump (0,0 -> 2,0) - Invalid");
        boolean r4 = game.playerMove(0, 0, 2, 0);
        System.out.println("Result: " + r4);

        game.printBoard();
    }
}
