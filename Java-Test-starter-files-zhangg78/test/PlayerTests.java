import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlayerTests {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testTwoArgConstructor() {
        String name = "abc";
        Player p1 = new Player(name, 1);

        // assertion
        assertEquals("the player's name variable should be \"abc\"!", name, p1.toString());
        assertEquals("the player's num variable should be \"1\"!", 1, p1.getNum());
    }

    @Test(timeout = 500)
    public void testSetName() {
        Player p3 = new Player("foo", 6);
        String newName = "oof";
        p3.setName(newName);

        // assertion
        assertEquals("the player's name variable should have been set to \"oof\"!", newName, p3.toString());
    }

    @Test(timeout = 500)
    public void testCountMoves() {
        Player p5 = new Player("X", 1);
        List<Board> myBoardsList = new ArrayList<>();
        Board b1 = new Board();
        Board b2 = new Board();
        myBoardsList.add(b1);
        myBoardsList.add(b2);
        b1.moveX(0, 1);
        b2.moveX(0, 1);
        b2.moveO(1, 1);
        b2.moveX(0, 0);

        // assertion
        assertEquals("countMoves did not return 3 when the list of boards contained 3 moves made by 'X'",3, p5.countMoves(myBoardsList));
    }

    @Test(timeout = 500)
    public void testHasLine() {

        char[][] grid = {{'X', 'X', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'O'}};

        assertTrue("X occurs in a line in:" +
                "\nXXX\nOXO\nXOO\nbut false returned by Player.hasLine", Player.hasLine(grid, 'X'));
    }
}
