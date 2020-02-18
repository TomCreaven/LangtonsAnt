import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LangtonAntKataTest {

    @Test
    void antStartsOnTheBoard() {

        // givenABoardExistsOfSizeXByY
        Board board = new Board(10,15);
        // whenTheAntIsInPositionPP
        int x = 3;
        int y = 6;
        board.placeAnt(x, y);
        // thenTheAntIsInPositionPP
        assertEquals(x, board.getAntPosition().getXCood());
        assertEquals(y, board.getAntPosition().getYCood());

    }
    @Test
    void antStartsElsewhereOnTheBoard() {

        // givenABoardExistsOfSizeXByY
        Board board = new Board(10,15);
        // whenTheAntIsInPositionPP
        int x = 7;
        int y = 9;
        board.placeAnt(x, y);
        // thenTheAntIsInPositionPP
        assertEquals(x, board.getAntPosition().getXCood());
        assertEquals(y, board.getAntPosition().getYCood());

    }

    @Test
    void antCannotBeOffTheBoard(){
        //givenABoardOfHAndL
        Board board = new Board(10,15);

        //WhenTheAntIsPlacedOnTheBoard


        assertThrows(IllegalArgumentException.class, () -> board.placeAnt(100, 200));

    }

    @Test
    void antCanMoveOnePosition() {
        Board board = new Board(10,15);
        board.placeAnt(1, 1);

        board.moveAnt();

        assertEquals(1, board.getAntPosition().getXCood());
        assertEquals(2, board.getAntPosition().getYCood());
    }

    @Test
    void antCannotFallOffTheBoardWhenMoving(){
        //givenABoardOfHAndL
        Board board = new Board(10,15);
        board.placeAnt(1, 15);

        //WhenTheAntIsPlacedOnTheBoard

        assertThrows(IllegalArgumentException.class, () -> board.moveAnt());

    }

}
