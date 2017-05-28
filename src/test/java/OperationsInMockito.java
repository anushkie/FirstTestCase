import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

/**
 * Created by balaji on 5/28/2017.
 */
public class OperationsInMockito {
    Calculator calculatorMock;

    @Before
    public void create() {
        calculatorMock = mock(Calculator.class);
        when(calculatorMock.adder(1, 8)).thenReturn(9);
    }

    @Test
    public void Test() {
        assertEquals(9, calculatorMock.adder(1,8));

        verify(calculatorMock).adder(eq(1), eq(8));

        verify(calculatorMock, times(5)).adder(1,8);
    }
}
