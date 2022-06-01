import java.awt.*;
import java.util.ArrayList;

public class Knight extends Piece {
    public Knight(int x, int y, int playerNumber) {
        super(x,y, playerNumber);
    }

    public char getSymbol() {
        if(this.getPlayerNumber() == 1) {
            return 'H';
        } else {
            return 'h';
        }
    }

    public ArrayList<Point> getPossibleMoves(Board board) {
        ArrayList<Point> possibleMoves = new ArrayList<>();

//       x8 x1
//     x7     x2
//         O
//     x6     x3
//       x5  x4
        if(this.getPlayerNumber() == 1) {
            if(this.x + 1 < 9 && this.y + 2 < 9) {// 1
                Piece pieceAtPosition = board.getPieceAt(x + 1, y + 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 1, y + 2));
                }
            }

            if(this.x + 2 < 9 && this.y + 1 < 9) { //2
                Piece pieceAtPosition = board.getPieceAt(x + 2, y + 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 2, y + 1));
                }
            }

            if(this.x + 2 < 9 && this.y - 1 > 0) { //3
                Piece pieceAtPosition = board.getPieceAt(x + 2, y - 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 2, y - 1));
                }
            }

            if(this.x + 1 < 9 && this.y - 2 > 0) { //4
                Piece pieceAtPosition = board.getPieceAt(x + 1, y - 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 1, y - 2));
                }
            }

            if(this.x - 1 > 0 && this.y - 2 > 0) { //5
                Piece pieceAtPosition = board.getPieceAt(x - 1, y - 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 1, y - 2));
                }
            }

            if(this.x - 2 > 0 && this.y - 1 > 0) { //6
                Piece pieceAtPosition = board.getPieceAt(x - 2, y - 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 2, y - 1));
                }
            }

            if(this.x - 2 > 0 && this.y + 1 < 9) { //7
                Piece pieceAtPosition = board.getPieceAt(x - 2, y + 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 2, y + 1));
                }
            }

            if(this.x - 1 > 0 && this.y + 2 < 9) { //8
                Piece pieceAtPosition = board.getPieceAt(x - 1, y + 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 1, y + 2));
                }
            }
        }

        if(this.getPlayerNumber() == 2) {
            if(this.x - 1 > 0 && this.y - 2 > 0) {// 1
                Piece pieceAtPosition = board.getPieceAt(x - 1, y - 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 1, y - 2));
                }
            }

            if(this.x - 2 > 0 && this.y - 1 > 0) { //2
                Piece pieceAtPosition = board.getPieceAt(x - 2, y - 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 2, y - 1));
                }
            }

            if(this.x - 2 > 0 && this.y + 1 < 9) { //3
                Piece pieceAtPosition = board.getPieceAt(x - 2, y + 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 2, y + 1));
                }
            }

            if(this.x - 1 > 0 && this.y + 2 < 9) { //4
                Piece pieceAtPosition = board.getPieceAt(x - 1, y + 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x - 1, y + 2));
                }
            }

            if(this.x + 1 < 9 && this.y + 2 < 9) { //5
                Piece pieceAtPosition = board.getPieceAt(x + 1, y + 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 1, y + 2));
                }
            }

            if(this.x + 2 < 9 && this.y + 1 < 9) { //6
                Piece pieceAtPosition = board.getPieceAt(x + 2, y + 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 2, y + 1));
                }
            }

            if(this.x + 2 < 9 && this.y - 1 > 0) { //7
                Piece pieceAtPosition = board.getPieceAt(x + 2, y - 1);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 2, y - 1));
                }
            }

            if(this.x + 1 < 9 && this.y - 2 > 0) { //8
                Piece pieceAtPosition = board.getPieceAt(x + 1, y - 2);
                if(pieceAtPosition == null || pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleMoves.add(new Point(x + 1, y - 2));
                }
            }
        }

        return possibleMoves;
    }

    public ArrayList<Point> getPossibleKillingMoves(Board board) {
        ArrayList<Point> possibleKillingMoves = new ArrayList<>();

        if(this.getPlayerNumber() == 1) {
            if(this.x + 1 < 9 && this.y + 2 < 9) {// 1
                Piece pieceAtPosition = board.getPieceAt(x + 1, y + 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 1, y + 2));
                }
            }

            if(this.x + 2 < 9 && this.y + 1 < 9) { //2
                Piece pieceAtPosition = board.getPieceAt(x + 2, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 2, y + 1));
                }
            }

            if(this.x + 2 < 9 && this.y - 1 > 0) { //3
                Piece pieceAtPosition = board.getPieceAt(x + 2, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 2, y - 1));
                }
            }

            if(this.x + 1 < 9 && this.y - 2 > 0) { //4
                Piece pieceAtPosition = board.getPieceAt(x + 1, y - 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 1, y - 2));
                }
            }

            if(this.x - 1 > 0 && this.y - 2 > 0) { //5
                Piece pieceAtPosition = board.getPieceAt(x - 1, y - 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 1, y - 2));
                }
            }

            if(this.x - 2 > 0 && this.y - 1 > 0) { //6
                Piece pieceAtPosition = board.getPieceAt(x - 2, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 2, y - 1));
                }
            }

            if(this.x - 2 > 0 && this.y + 1 < 9) { //7
                Piece pieceAtPosition = board.getPieceAt(x - 2, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 2, y + 1));
                }
            }

            if(this.x - 1 > 0 && this.y + 2 < 9) { //8
                Piece pieceAtPosition = board.getPieceAt(x - 1, y + 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 1, y + 2));
                }
            }
        }

        if(this.getPlayerNumber() == 2) {
            if(this.x - 1 > 0 && this.y - 2 > 0) {// 1
                Piece pieceAtPosition = board.getPieceAt(x - 1, y - 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 1, y - 2));
                }
            }

            if(this.x - 2 > 0 && this.y - 1 > 0) { //2
                Piece pieceAtPosition = board.getPieceAt(x - 2, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 2, y - 1));
                }
            }

            if(this.x - 2 > 0 && this.y + 1 < 9) { //3
                Piece pieceAtPosition = board.getPieceAt(x - 2, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 2, y + 1));
                }
            }

            if(this.x - 1 > 0 && this.y + 2 < 9) { //4
                Piece pieceAtPosition = board.getPieceAt(x - 1, y + 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x - 1, y + 2));
                }
            }

            if(this.x + 1 < 9 && this.y + 2 < 9) { //5
                Piece pieceAtPosition = board.getPieceAt(x + 1, y + 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 1, y + 2));
                }
            }

            if(this.x + 2 < 9 && this.y + 1 < 9) { //6
                Piece pieceAtPosition = board.getPieceAt(x + 2, y + 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 2, y + 1));
                }
            }

            if(this.x + 2 < 9 && this.y - 1 > 0) { //7
                Piece pieceAtPosition = board.getPieceAt(x + 2, y - 1);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 2, y - 1));
                }
            }

            if(this.x + 1 < 9 && this.y - 2 > 0) { //8
                Piece pieceAtPosition = board.getPieceAt(x + 1, y - 2);
                if(pieceAtPosition != null && pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                    possibleKillingMoves.add(new Point(x + 1, y - 2));
                }
            }
        }

        return possibleKillingMoves;
    }
}
