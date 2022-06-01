import java.awt.*;
import java.util.ArrayList;

public class Piece {
    private final int playerNumber;
    protected int x;
    protected int y;
    private boolean active;
    public Piece(int x, int y, int playerNumber) {
        this.x = x;
        this.y = y;
        this.playerNumber = playerNumber;
        this.active = true;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean getActive() {
        return this.active;
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public ArrayList<Point> getPossibleMoves(Board board) {
        return new ArrayList<>();
    }

    public ArrayList<Point> getPossibleKillingMoves(Board board) {
        return new ArrayList<>();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isKing() {
        return false;
    }

    public char getSymbol() {
        return 'X';
    }
}
