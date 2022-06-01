import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private ArrayList<Piece> pieces;
    private int winningPlayer;
    private int moveCount;

    public Board() {
        pieces = new ArrayList<>();
        pieces.add(new Rook(1,1, 1));
        pieces.add(new Knight(2,1, 1));
        pieces.add(new Bishop(3,1, 1));
        pieces.add(new Queen(4,1, 1));
        pieces.add(new King(5,1, 1));
        pieces.add(new Bishop(6,1, 1));
        pieces.add(new Knight(7,1, 1));
        pieces.add(new Rook(8,1, 1));
        pieces.add(new Pawn(1,2, 1));
        pieces.add(new Pawn(2,2, 1));
        pieces.add(new Pawn(3,2, 1));
        pieces.add(new Pawn(4,2, 1));
        pieces.add(new Pawn(5,2, 1));
        pieces.add(new Pawn(6,2, 1));
        pieces.add(new Pawn(7,2, 1));
        pieces.add(new Pawn(8,2, 1));

        pieces.add(new Rook(1,8, 2));
        pieces.add(new Knight(2,8, 2));
        pieces.add(new Bishop(3,8, 2));
        pieces.add(new Queen(4,8, 2));
        pieces.add(new King(5,8, 2));
        pieces.add(new Bishop(6,8, 2));
        pieces.add(new Knight(7,8, 2));
        pieces.add(new Rook(8,8, 2));
        pieces.add(new Pawn(1,7, 2));
        pieces.add(new Pawn(2,7, 2));
        pieces.add(new Pawn(3,7, 2));
        pieces.add(new Pawn(4,7, 2));
        pieces.add(new Pawn(5,7, 2));
        pieces.add(new Pawn(6,7, 2));
        pieces.add(new Pawn(7,7, 2));
        pieces.add(new Pawn(8,7, 2));
    }

    public void play() {
        while(true) {
            if(!this.move(1)) {
                break;
            }
            this.drawBoard();
            if(this.checkIfWon()) {
                break;
            }

            if(!this.move(2)) {
                break;
            }
            this.drawBoard();
            if(this.checkIfWon()) {
                break;
            }
        }

        if(this.winningPlayer != 0) {
            System.out.println("Player " + this.winningPlayer + " has won! Game took " + this.moveCount + " moves.");
        } else {
            System.out.println("Stalemate! 0 possible moves for a player!.  Game took " + this.moveCount + " moves.");
        }
    }

    private boolean checkIfWon() {
        return this.winningPlayer != 0;
    }

    private boolean move(int playerNumber) {
        moveCount++;
        ArrayList<Piece> piecesWithMoves = new ArrayList<>();

        ArrayList<Piece> piecesWithKillingMoves = new ArrayList<>();
        for(Piece piece : pieces) {
            if(piece.getPlayerNumber() != playerNumber || !piece.getActive()) {
                continue;
            }

            if(piece.getPossibleMoves(this).size() > 0) {
                piecesWithMoves.add(piece);
                for(Point move : piece.getPossibleMoves(this)) {
                    if(this.getPieceAt((int)move.getX(), (int)move.getY()) != null) {
                        piecesWithKillingMoves.add(piece);
                        break;
                    }
                }
            }
        }

        if(piecesWithMoves.size() == 0) {
            return false;
        }

        if(piecesWithKillingMoves.size() > 0) {
            int pieceIndex = (int)(Math.random() * piecesWithKillingMoves.size());

            Piece pieceToMove = piecesWithKillingMoves.get(pieceIndex);

            ArrayList<Point> possibleKillingMoves = pieceToMove.getPossibleKillingMoves(this);

            int moveIndex = (int)(Math.random() * possibleKillingMoves.size());

            Piece pieceToKill = this.getPieceAt((int)possibleKillingMoves.get(moveIndex).getX(), (int)possibleKillingMoves.get(moveIndex).getY());
            pieceToKill.setActive(false);
            if(pieceToKill.isKing()) {
                this.winningPlayer = playerNumber;
            }

            System.out.println();
            System.out.println("Player " + playerNumber + " moved " + pieceToMove.getSymbol() + " from " + pieceToMove.getX() + "," + pieceToMove.getY() + " to " + (int)possibleKillingMoves.get(moveIndex).getX() + "," + (int)possibleKillingMoves.get(moveIndex).getY() + " killing a " + pieceToKill.getSymbol());
            pieceToMove.setX((int)possibleKillingMoves.get(moveIndex).getX());
            pieceToMove.setY((int)possibleKillingMoves.get(moveIndex).getY());
        } else {
            int pieceIndex = (int)(Math.random() * piecesWithMoves.size());

            Piece pieceToMove = piecesWithMoves.get(pieceIndex);

            ArrayList<Point> possibleMoves = pieceToMove.getPossibleMoves(this);

            int moveIndex = (int)(Math.random() * possibleMoves.size());

            System.out.println();
            System.out.println("Player " + playerNumber + " moved " + pieceToMove.getSymbol() + " from " + pieceToMove.getX() + "," + pieceToMove.getY() + " to " + (int)possibleMoves.get(moveIndex).getX() + "," + (int)possibleMoves.get(moveIndex).getY());
            pieceToMove.setX((int)possibleMoves.get(moveIndex).getX());
            pieceToMove.setY((int)possibleMoves.get(moveIndex).getY());
        }

        return true;
    }

    public Piece getPieceAt(int x, int y) {
        for(Piece piece : pieces) {
            if(piece.getX() == x && piece.getY() == y && piece.getActive()) {
                return piece;
            }
        }

        return null;
    }

    private void drawBoard() {

        System.out.print("-------------------------");
        System.out.println();

        for(int y = 8; y > 0; y--) {
            for(int x = 1; x <= 8; x++) {
                Piece piece = this.getPieceAt(x, y);
                if(piece == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(piece.getSymbol());
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.print("-------------------------");

        try {
            Thread.sleep(100);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        for(int x = 0; x < 10; x++) {
            System.out.println();
        }
    }
}
