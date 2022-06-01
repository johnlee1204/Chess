import java.awt.*;
import java.util.ArrayList;

public class King extends Piece {
    public King(int x, int y, int playerNumber) {
        super(x,y, playerNumber);
    }

    public boolean isKing() {
        return true;
    }

    public char getSymbol() {
        if(this.getPlayerNumber() == 1) {
            return 'K';
        } else {
            return 'k';
        }
    }

    public ArrayList<Point> getPossibleMoves(Board board) {
        ArrayList<Point> possibleMoves = new ArrayList<>();

        //Rook Section
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 2; i++) {
                if(this.x + i < 9) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y));
                    }
                }

                if(this.x - i > 0) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y));
                    }
                }

                if(this.y + i < 9) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y + i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x, this.y + i));
                    }
                }

                if(this.y - i > 0) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y - i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x, this.y - i));
                    }
                }
            }
        } else {
            for(int i = 1; i < 2; i++) {
                if(this.x - i > 0) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y));
                    }
                }

                if(this.x + i < 9) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y));
                    }
                }

                if(this.y - i > 0) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y - i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x, this.y - i));
                    }
                }

                if(this.y + i < 0) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y + i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x, this.y + i));
                    }
                }
            }
        }

        //Bishop Section
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 2; i++) {
                if(this.x + i < 9 && this.y + i < 9) { // Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y + i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y + i));
                    }
                }

                if(this.x - i > 0 && this.y + i < 9) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y + i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y + i));
                    }
                }

                if(this.x + i < 9 && this.y - i > 0) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y - i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y - i));
                    }
                }

                if(this.x - i > 0 && this.y - i > 0) { //Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y - i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y - i));
                    }
                }
            }
        } else {
            for(int i = 1; i < 2; i++) {
                if(this.x - i > 0 && this.y - i > 0) { //Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y - i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y - i));
                    }
                }

                if(this.x + i < 9 && this.y - i > 0) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y - i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y - i));
                    }
                }

                if(this.x - i > 0 && this.y + i < 9) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y + i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y + i));
                    }
                }

                if(this.x + i < 9 && this.y + i < 9) { // Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y + i));
                        }
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y + i));
                    }
                }
            }
        }

        return possibleMoves;
    }

    public ArrayList<Point> getPossibleKillingMoves(Board board) {
        ArrayList<Point> possibleKillingMoves = new ArrayList<>();

        //Rook Section
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 2; i++) {
                if(this.x + i < 9) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y));
                        }
                    }
                }

                if(this.x - i > 0) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y));
                        }
                    }
                }

                if(this.y + i < 9) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y + i));
                        }
                    }
                }

                if(this.y - i > 0) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y - i));
                        }
                    }
                }
            }
        } else {
            for(int i = 1; i < 2; i++) {
                if(this.x - i > 0) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y));
                        }
                    }
                }

                if(this.x + i < 9) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y));
                        }
                    }
                }

                if(this.y - i > 0) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y - i));
                        }
                    }
                }

                if(this.y + i < 9) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y + i));
                        }
                    }
                }
            }
        }

        //Bishop Section
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 2; i++) {
                if(this.x + i < 9 && this.y + i < 9) { // Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y + i));
                        }
                    }
                }

                if(this.x - i > 0 && this.y + i < 9) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y + i));
                        }
                    }
                }

                if(this.x + i < 9 && this.y - i > 0) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y - i));
                        }
                    }
                }

                if(this.x - i > 0 && this.y - i > 0) { //Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y - i));
                        }
                    }
                }
            }
        } else {
            for(int i = 1; i < 2; i++) {
                if(this.x - i > 0 && this.y - i > 0) { //Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y - i));
                        }
                    }
                }

                if(this.x + i < 9 && this.y - i > 0) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y - i));
                        }
                    }
                }

                if(this.x - i > 0 && this.y + i < 9) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y + i));
                        }
                    }
                }

                if(this.x + i < 9 && this.y + i < 9) { // Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y + i));
                        }
                    }
                }
            }
        }

        return possibleKillingMoves;
    }
}
