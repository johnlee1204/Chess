import java.awt.*;
import java.util.ArrayList;

public class Pawn extends Piece {
    public Pawn(int x, int y, int playerNumber) {
        super(x,y, playerNumber);
    }

    public char getSymbol() {
        if(this.getPlayerNumber() == 1) {
            return 'P';
        } else {
            return 'p';
        }
    }

    public ArrayList<Point> getPossibleMoves(Board board) {
        ArrayList<Point> possibleMoves = new ArrayList<>();

        if(this.getPlayerNumber() == 1) {
            if(this.x - 1 > 0 && this.y + 1 < 9) { //Player 1 Up Left
                Piece pieceAtPosition = board.getPieceAt(x - 1, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 2) {
                    possibleMoves.add(new Point(x - 1, y + 1));
                }
            }

            if(this.y + 1 < 9) { //Player 1 Up
                Piece pieceAtPosition = board.getPieceAt(x, y + 1);
                if(pieceAtPosition == null) {
                    possibleMoves.add(new Point(x, y + 1));
                }
            }

            if(this.x + 1 > 0 && this.y + 1 < 9) { //Player 1 Up Right
                Piece pieceAtPosition = board.getPieceAt(x + 1, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 2) {
                    possibleMoves.add(new Point(x + 1, y + 1));
                }
            }
        }

        if(this.getPlayerNumber() == 2) {
            if(this.x + 1 < 9 && this.y - 1 > 0) { //Player 2 Up Left
                Piece pieceAtPosition = board.getPieceAt(x + 1, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 1) {
                    possibleMoves.add(new Point(x + 1, y - 1));
                }
            }

            if(this.y - 1 > 0) { //Player 2 Up
                Piece pieceAtPosition = board.getPieceAt(x, y - 1);
                if(pieceAtPosition == null) {
                    possibleMoves.add(new Point(x, y - 1));
                }
            }

            if(this.x - 1 > 0 && this.y - 1 < 9) { //Player 2 Up Right
                Piece pieceAtPosition = board.getPieceAt(x - 1, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 1) {
                    possibleMoves.add(new Point(x - 1, y - 1));
                }
            }
        }

        return possibleMoves;
    }

    public ArrayList<Point> getPossibleKillingMoves(Board board) {
        ArrayList<Point> possibleKillingMoves = new ArrayList<>();

        if(this.getPlayerNumber() == 1) {
            if(this.x - 1 > 0 && this.y + 1 < 9) { //Player 1 Up Left
                Piece pieceAtPosition = board.getPieceAt(x - 1, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 2) {
                    possibleKillingMoves.add(new Point(x - 1, y + 1));
                }
            }

            if(this.x + 1 > 0 && this.y + 1 < 9) { //Player 1 Up Right
                Piece pieceAtPosition = board.getPieceAt(x + 1, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 2) {
                    possibleKillingMoves.add(new Point(x + 1, y + 1));
                }
            }
        }

        if(this.getPlayerNumber() == 2) {
            if(this.x + 1 < 9 && this.y - 1 > 0) { //Player 2 Up Left
                Piece pieceAtPosition = board.getPieceAt(x + 1, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 1) {
                    possibleKillingMoves.add(new Point(x + 1, y - 1));
                }
            }

            if(this.x - 1 > 0 && this.y - 1 < 9) { //Player 2 Up Right
                Piece pieceAtPosition = board.getPieceAt(x - 1, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() == 1) {
                    possibleKillingMoves.add(new Point(x - 1, y - 1));
                }
            }
        }

        return possibleKillingMoves;
    }
}
