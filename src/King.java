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
}
