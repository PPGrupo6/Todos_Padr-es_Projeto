import org.junit.Test;
import static org.junit.Assert.*;

public class InterpreterTest {

    @Test
    public void testNumberExpression() {
        Expression number = new NumberExpression(5);
        assertEquals(5, number.interpret());
    }

    @Test
    public void testAddExpression() {
        Expression expr = new AddExpression(new NumberExpression(2), new NumberExpression(3));
        assertEquals(5, expr.interpret());
    }

    @Test
    public void testSubtractExpression() {
        Expression expr = new SubtractExpression(new NumberExpression(4), new NumberExpression(1));
        assertEquals(3, expr.interpret());
    }
}
