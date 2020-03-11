import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestQuestion {
    @Test
    public void testCreate() {
        Question q = new Question(3, 4, "+");
        assertFalse(q.checkAnswer(0, 7));
    }
}
