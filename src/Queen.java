import java.awt.*;
import java.util.ArrayList;

public class Queen extends Piece {
    public Queen(int x, int y, int playerNumber) {
        super(x,y, playerNumber);
    }

    public char getSymbol() {
        if(this.getPlayerNumber() == 1) {
            return 'Q';
        } else {
            return 'q';
        }
    }

    public ArrayList<Point> getPossibleMoves(Board board) {
        ArrayList<Point> possibleMoves = new ArrayList<>();

        boolean right = true, left = true, up = true, down = true; //Rook Section
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 9; i++) {
                if(this.x + i < 9 && right) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y));
                        }
                        right = false;
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y));
                    }
                }

                if(this.x - i > 0 && left) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y));
                        }
                        left = false;
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y));
                    }
                }

                if(this.y + i < 9 && up) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y + i));
                        }
                        up = false;
                    } else {
                        possibleMoves.add(new Point(this.x, this.y + i));
                    }
                }

                if(this.y - i > 0 && down) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y - i));
                        }
                        down = false;
                    } else {
                        possibleMoves.add(new Point(this.x, this.y - i));
                    }
                }
            }
        } else {
            for(int i = 1; i < 9; i++) {
                if(this.x - i > 0 && right) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x - i, this.y));
                        }
                        right = false;
                    } else {
                        possibleMoves.add(new Point(this.x - i, this.y));
                    }
                }

                if(this.x + i < 9 && left) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x + i, this.y));
                        }
                        left = false;
                    } else {
                        possibleMoves.add(new Point(this.x + i, this.y));
                    }
                }

                if(this.y - i > 0 && up) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y - i));
                        }
                        up = false;
                    } else {
                        possibleMoves.add(new Point(this.x, this.y - i));
                    }
                }

                if(this.y + i < 0 && down) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleMoves.add(new Point(this.x, this.y + i));
                        }
                        down = false;
                    } else {
                        possibleMoves.add(new Point(this.x, this.y + i));
                    }
                }
            }
        }

        boolean upRight = true, upLeft = true, downRight = true, downLeft = true; //Bishop Section
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

        boolean right = true, left = true, up = true, down = true; //Rook Section
        if(this.getPlayerNumber() == 1) {
            for(int i = 1; i < 9; i++) {
                if(this.x + i < 9 && right) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y));
                        }
                        right = false;
                    }
                }

                if(this.x - i > 0 && left) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y));
                        }
                        left = false;
                    }
                }

                if(this.y + i < 9 && up) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y + i));
                        }
                        up = false;
                    }
                }

                if(this.y - i > 0 && down) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y - i));
                        }
                        down = false;
                    }
                }
            }
        } else {
            for(int i = 1; i < 9; i++) {
                if(this.x - i > 0 && right) { //Right
                    Piece pieceAtPosition = board.getPieceAt(this.x - i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x - i, this.y));
                        }
                        right = false;
                    }
                }

                if(this.x + i < 9 && left) { //Left
                    Piece pieceAtPosition = board.getPieceAt(this.x + i, this.y);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x + i, this.y));
                        }
                        left = false;
                    }
                }

                if(this.y - i > 0 && up) { //Up
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y - i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y - i));
                        }
                        up = false;
                    }
                }

                if(this.y + i < 9 && down) { //Down
                    Piece pieceAtPosition = board.getPieceAt(this.x, this.y + i);
                    if(pieceAtPosition != null) {
                        if(pieceAtPosition.getPlayerNumber() != this.getPlayerNumber()) {
                            possibleKillingMoves.add(new Point(this.x, this.y + i));
                        }
                        down = false;
                    }
                }
            }
        }

        boolean upRight = true, upLeft = true, downRight = true, downLeft = true; //Bishop Section
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
