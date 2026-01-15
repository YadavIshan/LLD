# Chess Game (Basic PvP) - OCP & SRP Example

This project implements a basic Player-vs-Player Chess game following SOLID principles, specifically **Single Responsibility Principle (SRP)** and **Open/Closed Principle (OCP)**.

## Principles Applied

### 1. Single Responsibility Principle (SRP)
- **`Board`**: Only manages the grid state (8x8 spots). It doesn't know about game rules or move mechanics.
- **`Piece`**: Each piece (Pawn, King, etc.) is responsible for its own movement validation (`canMove`).
- **`Game`**: Manages turn-based flow, player handling, and high-level game status (Win/Loss).
- **`Move`**: encapsulate a move action.

### 2. Open/Closed Principle (OCP)
The system is **Open for Extension** but **Closed for Modification**.
- **New Pieces**: If we want to add a `Cannon` or `Wizard` piece, we simply create a new class extending `Piece`. We logic is self-contained. **No changes are needed in `Board` or `Game` logic** to support the new piece's movement.
- **New Rules**: `Game` class orchestrates the rules. We can subclass `Game` for variants (e.g., `BlitzGame`) without modifying the core entities.

## LLD Class Diagram

```mermaid
classDiagram
    class Game {
        -Board board
        -Player[] players
        -void initializeBoard()
        +boolean playerMove(int x1, int y1, int x2, int y2)
    }

    class Board {
        -Spot[][] spots
        +Spot getSpot(int x, int y)
        +void resetBoard()
    }

    class Spot {
        -int x, y
        -Piece piece
        +boolean isOccupied()
    }

    class Piece {
        <<Abstract>>
        -PieceColor color
        +boolean canMove(Board b, Spot start, Spot end)*
    }

    class Pawn { +canMove(...) }
    class Rook { +canMove(...) }
    class Knight { +canMove(...) }
    class Bishop { +canMove(...) }
    class Queen { +canMove(...) }
    class King { +canMove(...) }

    class Player {
        -boolean whiteSide
        -boolean humanPlayer
    }

    Game --> Board
    Board *-- Spot
    Spot o-- Piece
    Piece <|-- Pawn
    Piece <|-- Rook
    Piece <|-- Knight (and others)
    Game --> Player
```

## How to Run

1. Compile all files in `SOLID/OCP/Example6`.
2. Run `Main.java`.
3. Enter moves in format: `startX startY endX endY` (e.g., `1 4 3 4` for White Pawn 2-step).
