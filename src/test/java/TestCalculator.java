import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by balaji on 5/27/2017.
 */
public class TestCalculator {

    @Test
    public void testAdder() {
        Calculator calculator = new Calculator();
        int output = calculator.adder(3, 5);
        assertEquals(8, output);
    }

    @Test
    public void testSubtration() {

        Calculator calculator = new Calculator();
        int subtractionOutput = calculator.subtractor(8, 5);
        assertEquals(3, subtractionOutput);
    }

    @Test
    public void testDivision() {

        Calculator calculator = new Calculator();
        int divideOutput = calculator.dividor(4,4);
        assertEquals(1, divideOutput);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int multiplicationOutput = calculator.multipication(6, 3);
        assertEquals(18, multiplicationOutput);
    }

}
