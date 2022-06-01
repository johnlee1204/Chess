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
}
