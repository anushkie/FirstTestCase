import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by balaji on 5/27/2017.
 */
public class AddTestUSingMockito {

    @Mock
    Calculator calculatorMock;

    @Before
    public void create() {
        calculatorMock = mock(Calculator.class);
        when(calculatorMock.adder(1, 2)).thenReturn(3);
    }

    @Test
    public void test() {
        assertEquals(3, calculatorMock.adder(1,2));
    }
}