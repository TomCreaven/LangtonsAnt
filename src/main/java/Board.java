public class Board {

    private int antX;
    private int antY;
    private final int boardLength;
    private final int boardHeight;

    public Board(int length, int height) {

        boardLength = length;
        boardHeight = height;
    }

    public void placeAnt(int x, int y) {
        if (x > boardLength || y > boardHeight){
            throw new IllegalArgumentException();
        }

        antX = x;
        antY=y;

    }

    public AntPosition getAntPosition() {
        return new AntPosition(antX, antY);
    }

    public void moveAnt() {
        antY++;
        if(antY > boardHeight){
            throw new IllegalArgumentException();
        }

    }
}
