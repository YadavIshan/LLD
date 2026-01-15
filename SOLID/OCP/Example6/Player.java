package SOLID.OCP.Example6;

public class Player {
    private final boolean whiteSide;
    private final boolean humanPlayer;

    public Player(boolean whiteSide, boolean humanPlayer) {
        this.whiteSide = whiteSide;
        this.humanPlayer = humanPlayer;
    }

    public boolean isWhiteSide() {
        return whiteSide;
    }

    public boolean isHumanPlayer() {
        return humanPlayer;
    }
}
