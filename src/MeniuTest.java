import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Catalin on 3/30/2017.
 */
public class MeniuTest {
    @Test
    public void menuMoveDownOneTime() {
        Meniu m = new Meniu();
        m.moveDown();
        assertEquals("Meniu item must to move down.", new Integer(1), m.options.get(3));
    }

    @Test
    public void menuMoveDownFourTime() {
        Meniu m = new Meniu();
        m.moveDown();
        m.moveDown();
        m.moveDown();
        m.moveDown();
        assertEquals("Meniu must get back to first item.", new Integer(1), m.options.get(0));
    }

    @Test
    public void menuMoveUpOneTime() {
        Meniu m = new Meniu();
        m.moveUp();
        assertEquals("Meniu item must to move down.", new Integer(1), m.options.get(1));
    }

    @Test
    public void menuMoveUpFourTime() {
        Meniu m = new Meniu();
        m.moveUp();
        m.moveUp();
        m.moveUp();
        m.moveUp();
        assertEquals("Meniu must get back to first item.", new Integer(1), m.options.get(0));
    }

    @Test
    public void createNewGame() {
        Meniu m = new Meniu();
        m.newGame("TestGame");
        assertEquals("GameMustBeCreated", "TestGame", m.game.name);
    }

    @Test
    public void ExitGame() {
        Meniu m = new Meniu();
        m.Exit();
        assertEquals("GameMustBeCreated", null, m.game);
    }

}