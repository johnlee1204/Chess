public class Rook extends Piece {
    public Rook(int x, int y, int playerNumber) {
        super(x,y, playerNumber);
    }

    public char getSymbol() {
        if(this.getPlayerNumber() == 1) {
            return 'R';
        } else {
            return 'r';
        }
    }
}
