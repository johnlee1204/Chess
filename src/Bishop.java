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
}
