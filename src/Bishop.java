import java.awt.*;
import java.util.ArrayList;

public class Bishop extends Piece {
    public Bishop(int x, int y, int playerNumber) {
        super(x,y, playerNumber);
    }

    public char getSymbol() {
        if(this.getPlayerNumber() == 1) {
            return 'B';
        } else {
            return 'b';
        }
    }

    public ArrayList<Point> getPossibleMoves(Board board) {
        ArrayList<Point> possibleMoves = new ArrayList<>();

        boolean upRight = true, upLeft = true, downRight = true, downLeft = true;
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 9; i++) {
                if(this.x + i < 9 && this.y + i < 9 && upRight) { // Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y + i));
                        }
                        upRight = false;
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y + i));
                    }
                }

                if(this.x - i > 0 && this.y + i < 9 && upLeft) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y + i));
                        }
                        upLeft = false;
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y + i));
                    }
                }

                if(this.x + i < 9 && this.y - i > 0 && downRight) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y - i));
                        }
                        downRight = false;
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y - i));
                    }
                }

                if(this.x - i > 0 && this.y - i > 0 && downLeft) { //Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y - i));
                        }
                        downLeft = false;
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y - i));
                    }
                }
            }
        } else {
            for(int i = 1; i < 9; i++) {
                if(this.x - i > 0 && this.y - i > 0 && downLeft) { //Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y - i));
                        }
                        downLeft = false;
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y - i));
                    }
                }

                if(this.x + i < 9 && this.y - i > 0 && downRight) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y - i));
                        }
                        downRight = false;
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y - i));
                    }
                }

                if(this.x - i > 0 && this.y + i < 9 && upLeft) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y + i));
                        }
                        upLeft = false;
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y + i));
                    }
                }

                if(this.x + i < 9 && this.y + i < 9 && upRight) { // Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y + i));
                        }
                        upRight = false;
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

        boolean upRight = true, upLeft = true, downRight = true, downLeft = true;
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 9; i++) {
                if(this.x + i < 9 && this.y + i < 9 && upRight) { // Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y + i));
                        }
                        upRight = false;
                    }
                }

                if(this.x - i > 0 && this.y + i < 9 && upLeft) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y + i));
                        }
                        upLeft = false;
                    }
                }

                if(this.x + i < 9 && this.y - i > 0 && downRight) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y - i));
                        }
                        downRight = false;
                    }
                }

                if(this.x - i > 0 && this.y - i > 0 && downLeft) { //Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y - i));
                        }
                        downLeft = false;
                    }
                }
            }
        } else {
            for(int i = 1; i < 9; i++) {
                if(this.x - i > 0 && this.y - i > 0 && downLeft) { //Up Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y - i));
                        }
                        downLeft = false;
                    }
                }

                if(this.x + i < 9 && this.y - i > 0 && downRight) { //Up Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y - i));
                        }
                        downRight = false;
                    }
                }

                if(this.x - i > 0 && this.y + i < 9 && upLeft) { //Down Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y + i));
                        }
                        upLeft = false;
                    }
                }

                if(this.x + i < 9 && this.y + i < 9 && upRight) { // Down Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y + i));
                        }
                        upRight = false;
                    }
                }
            }
        }

        return possibleKillingMoves;
    }
}
