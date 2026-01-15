package SOLID.OCP.Example6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to OCP Chess!");
        System.out.println("White: [X], Black: {X}");
        System.out.println("Format: startX startY endX endY (e.g., 1 4 3 4)");

        while (game.getStatus() == GameStatus.ACTIVE) {
            game.printBoard();
            System.out.println("Enter move:");
            try {
                int sx = scanner.nextInt();
                int sy = scanner.nextInt();
                int ex = scanner.nextInt();
                int ey = scanner.nextInt();

                boolean success = game.playerMove(sx, sy, ex, ey);
                if (success) {
                    System.out.println("Move successful!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Use integers.");
                scanner.nextLine(); // clear buffer
            }
        }

        game.printBoard();
        System.out.println("Game Over! Status: " + game.getStatus());
        scanner.close();
    }
}
