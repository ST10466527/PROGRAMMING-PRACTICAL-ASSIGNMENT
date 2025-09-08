package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuestionTest {
    @Test
    public void testEasyQuestionCorrectness() {
        Question q = new EasyQuestion("Test?", new String[]{"A", "B", "C"}, 1);
        assertTrue(q.isCorrect(1));
        assertFalse(q.isCorrect(0));
    }

    @Test
    public void testHardQuestionPoints() {
        Question q = new HardQuestion("Hard?", new String[]{"A", "B"}, 0);
        assertEquals(2, q.getPoints());
    }
}
