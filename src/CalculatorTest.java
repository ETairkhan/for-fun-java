import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
 // You should understand how to import july4 here!!!
    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }
}