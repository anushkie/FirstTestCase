import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by balaji on 5/27/2017.
 */
public class DivideTestUsingMockito {

    @Mock
    Calculator calculatorMock;

    @Before
    public void create(){
        calculatorMock = mock(Calculator.class);
        when(calculatorMock.dividor(anyInt(),eq(0))).thenReturn(0);
    }

    @Test()
    public void test() {
        calculatorMock.dividor(1,0);
        calculatorMock.dividor(12, 48);
    }
}