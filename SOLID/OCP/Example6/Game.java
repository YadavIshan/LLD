package SOLID.OCP.Example6;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Board board;
    private final Player[] players;
    private int currentTurn;
    private GameStatus status;
    private final List<Move> movesPlayed; // History

    public Game() {
        this.board = new Board();
        this.players = new Player[2];
        this.players[0] = new Player(true, true); // White Human
        this.players[1] = new Player(false, true); // Black Human
        this.currentTurn = 0; // 0: White, 1: Black
        this.status = GameStatus.ACTIVE;
        this.movesPlayed = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        // White Pieces (Rows 0, 1)
        // Main Row (0)
        board.getSpot(0, 0).setPiece(new Rook(PieceColor.WHITE));
        board.getSpot(0, 1).setPiece(new Knight(PieceColor.WHITE));
        board.getSpot(0, 2).setPiece(new Bishop(PieceColor.WHITE));
        board.getSpot(0, 3).setPiece(new Queen(PieceColor.WHITE));
        board.getSpot(0, 4).setPiece(new King(PieceColor.WHITE));
        board.getSpot(0, 5).setPiece(new Bishop(PieceColor.WHITE));
        board.getSpot(0, 6).setPiece(new Knight(PieceColor.WHITE));
        board.getSpot(0, 7).setPiece(new Rook(PieceColor.WHITE));
        // Pawn Row (1)
        for (int i = 0; i < 8; i++) {
            board.getSpot(1, i).setPiece(new Pawn(PieceColor.WHITE));
        }

        // Black Pieces (Rows 7, 6)
        // Main Row (7)
        board.getSpot(7, 0).setPiece(new Rook(PieceColor.BLACK));
        board.getSpot(7, 1).setPiece(new Knight(PieceColor.BLACK));
        board.getSpot(7, 2).setPiece(new Bishop(PieceColor.BLACK));
        board.getSpot(7, 3).setPiece(new Queen(PieceColor.BLACK));
        board.getSpot(7, 4).setPiece(new King(PieceColor.BLACK));
        board.getSpot(7, 5).setPiece(new Bishop(PieceColor.BLACK));
        board.getSpot(7, 6).setPiece(new Knight(PieceColor.BLACK));
        board.getSpot(7, 7).setPiece(new Rook(PieceColor.BLACK));
        // Pawn Row (6)
        for (int i = 0; i < 8; i++) {
            board.getSpot(6, i).setPiece(new Pawn(PieceColor.BLACK));
        }
    }

    public boolean playerMove(int startX, int startY, int endX, int endY) {
        if (status != GameStatus.ACTIVE) {
            System.out.println("Game is over.");
            return false;
        }

        Spot startSpot = board.getSpot(startX, startY);
        Spot endSpot = board.getSpot(endX, endY);
        Piece sourcePiece = startSpot.getPiece();

        // 1. Check for piece presence
        if (sourcePiece == null) {
            System.out.println("No piece at start position.");
            return false;
        }

        // 2. Validate turn ownership
        Player player = players[currentTurn];
        if (player.isWhiteSide() != (sourcePiece.getColor() == PieceColor.WHITE)) {
            System.out.println("It is not your turn/piece.");
            return false;
        }

        // 3. Validate move rules
        if (!sourcePiece.canMove(board, startSpot, endSpot)) {
            System.out.println("Invalid move for this piece.");
            return false;
        }

        // 4. Execution
        Piece capturedPiece = endSpot.getPiece();

        // Move piece
        Move move = new Move(player, startSpot, endSpot);
        movesPlayed.add(move);

        endSpot.setPiece(sourcePiece);
        startSpot.setPiece(null);

        // 5. Check Game Over (King Capture)
        if (capturedPiece instanceof King) {
            if (player.isWhiteSide()) {
                this.status = GameStatus.WHITE_WIN;
            } else {
                this.status = GameStatus.BLACK_WIN;
            }
        }

        // 6. Next Turn
        if (this.status == GameStatus.ACTIVE) {
            this.currentTurn = (this.currentTurn + 1) % 2;
        }

        return true;
    }

    public void printBoard() {
        System.out.println("   0 1 2 3 4 5 6 7 (Y)");
        for (int x = 7; x >= 0; x--) {
            System.out.print(x + " ");
            for (int y = 0; y < 8; y++) {
                Spot spot = board.getSpot(x, y);
                Piece p = spot.getPiece();
                if (p == null) {
                    System.out.print("[ ]");
                } else {
                    String symbol = "";
                    if (p instanceof Pawn)
                        symbol = "P";
                    else if (p instanceof Rook)
                        symbol = "R";
                    else if (p instanceof Knight)
                        symbol = "N";
                    else if (p instanceof Bishop)
                        symbol = "B";
                    else if (p instanceof Queen)
                        symbol = "Q";
                    else if (p instanceof King)
                        symbol = "K";

                    if (p.getColor() == PieceColor.WHITE) {
                        System.out.print("[" + symbol + "]");
                    } else {
                        System.out.print("{" + symbol + "}");
                    }
                }
            }
            System.out.println(" " + x);
        }
        System.out.println("   0 1 2 3 4 5 6 7 (Y)");
    }

    public GameStatus getStatus() {
        return status;
    }
}
