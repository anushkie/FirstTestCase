import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anushka_as on 5/27/2017.
 */
public class TestCalculator {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdder() {
        int output = calculator.adder(3, 5);
        assertEquals(8, output);
    }

    @Test
    public void testSubtration() {
        int subtractionOutput = calculator.subtractor(8, 5);
        assertEquals(3, subtractionOutput);
    }

    @Test
    public void testDivision() {
        int divideOutput = calculator.dividor(4,4);
        assertEquals(1, divideOutput);
    }

    @Test
    public void testMultiplication() {
        int multiplicationOutput = calculator.multipication(6, 3);
        assertEquals(18, multiplicationOutput);
    }

}
