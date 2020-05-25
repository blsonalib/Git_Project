package demo.java.test;

import org.junit.Assert;
import org.junit.Test;

public class poweCalculatorTest {
    @Test
    public void toCheckZeroPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.getZeroPower(0);
        Assert.assertEquals(result,1);
    }
}
