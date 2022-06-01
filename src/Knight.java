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
}
