import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by balaji on 5/27/2017.
 */
public class TestCalculator {

    @Test
    public void testOperations() {
        Calculator calculator = new Calculator();
        int output = calculator.adder(3,5);
        assertEquals(8, output);
    }
}
