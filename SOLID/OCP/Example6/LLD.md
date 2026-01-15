# Low Level Design (LLD) - Chess Game

## Class Diagram

The following diagram illustrates the relationships between the core classes of the Chess system.

```mermaid
classDiagram
    %% Core Game Controller
    class Game {
        -Board board
        -Player[] players
        -List~Move~ movesPlayed
        -GameStatus status
        +playerMove(int startX, int startY, int endX, int endY)
    }

    %% Domain Entities
    class Board {
        -Spot[][] spots
        +getSpot(int x, int y)
        +resetBoard()
    }

    class Spot {
        -int x
        -int y
        -Piece piece
        +isOccupied()
        +getPiece()
        +setPiece(Piece p)
    }

    class Player {
        -boolean whiteSide
        -boolean humanPlayer
    }

    class Move {
        -Spot start
        -Spot end
        -Piece pieceMoved
        -Piece pieceKilled
    }

    class GameStatus {
        <<Enumeration>>
        ACTIVE
        WHITE_WIN
        BLACK_WIN
    }

    class PieceColor {
        <<Enumeration>>
        WHITE
        BLACK
    }

    %% Piece Hierarchy (OCP)
    class Piece {
        <<Abstract>>
        -PieceColor color
        +canMove(Board board, Spot start, Spot end)*
    }

    class Pawn { +canMove(...) }
    class Rook { +canMove(...) }
    class Knight { +canMove(...) }
    class Bishop { +canMove(...) }
    class Queen { +canMove(...) }
    class King { +canMove(...) }

    %% Relationships
    
    %% Composition: Game controls the Board
    Game *-- Board : Composition

    %% Aggregation: Game has Players (they exist outside a single game session concept usually, but here strict ownership)
    Game o-- Player : Aggregation

    %% Composition: Board is made of Spots
    Board *-- "64" Spot : Composition

    %% Aggregation: Spot holds a Piece (Piece can move to another Spot)
    Spot o-- Piece : Aggregation

    %% Inheritance: All specific pieces are Pieces
    Piece <|-- Pawn
    Piece <|-- Rook
    Piece <|-- Knight
    Piece <|-- Bishop
    Piece <|-- Queen
    Piece <|-- King

    %% Dependency: Piece needs Board and Spot to calculate validity
    Piece ..> Board : Uses
    Piece ..> Spot : Uses
    
    %% Dependency: Move records Spots and Pieces
    Move --> Spot
    Move --> Piece
    
    %% Enum Usage
    Piece --> PieceColor
    Game --> GameStatus
```

## Relationship Details

### 1. Inheritance (Solid Arrow with Triangle)
- **`Piece`** is the parent for **`Pawn`**, **`Rook`**, **`King`**, etc.
- This enables **Polymorphism**. The `Board` holds `Piece` references, but at runtime, they are specific types.

### 2. Composition (Solid Diamond)
- **`Game`** $\rightarrow$ **`Board`**: The `Board` is integral to the `Game`. If the `Game` is destroyed, that specific board instance is irrelevant.
- **`Board`** $\rightarrow$ **`Spot`**: The `Board` is *composed* of 64 `Spot`s. A `Spot` cannot exist meaningfully without the `Board`.

### 3. Aggregation (Hollow Diamond)
- **`Spot`** $\rightarrow$ **`Piece`**: A `Spot` *has a* `Piece`, but the `Piece` can be removed (moved) and exist elsewhere. It is a loose relationship.

### 4. Dependency (Dashed Arrow)
- **`Piece`** $\rightarrow$ **`Board`**: The `canMove` method *uses* the `Board` to check for collisions, but `Piece` does not *own* the `Board`.
