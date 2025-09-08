package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testScoreUpdate() {
        Player p = new Player("Silindokuhlle");
        p.addScore(2);
        assertEquals(2, p.getScore());
    }

    @Test
    public void testPlayerName() {
        Player p = new Player("Silindokkuhle");
        assertEquals("Silindokuhle", p.getName());
    }
}
