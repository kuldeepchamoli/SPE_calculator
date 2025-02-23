import com.iiitb.calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
public class calculator_test {

    calculator obj = new calculator();
    @Test
    public void testSquareRootFunc() {
        assertEquals("Value not Correct",4, obj.squareRootFunc(16),0);
    }
    @Test
    public void testFactorialFunc() {
        assertEquals("Value not Correct",120, obj.factorialFunc(5),0);
    }

    @Test
    public void testLogNatural() {
        assertEquals("Value not Correct",1.6094379124341003, obj.naturalLogFun(5),0);
    }

    @Test
    public void testPowerFunc() {
        assertEquals("Value not Correct",256, obj.powerFunc(2,8),0);
    }
}
