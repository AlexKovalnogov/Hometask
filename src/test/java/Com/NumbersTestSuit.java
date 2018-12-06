package Com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class NumbersTestSuit {

Numbers numbers;
    @Before
    public void setUp(){
     numbers = new Numbers();
    }

    @Test
    public void checkingMaxNumberFromPositivePartition() {
       assertEquals(5 ,numbers.getMaxNumber(3,4,5));
    }

    @Test
    public void checkingMaxNumberFromNegativePartition() {
        assertEquals(-5 ,numbers.getMaxNumber(-34,-10,-5));
    }

    @Test
    public void checkingMaxNumberFromPositivAndNegativePartition() { assertEquals(10 ,numbers.getMaxNumber(-34,10,-5));
    }
    @Test
    public void checkingMaxNumberFromTheSameNumbers() {
        assertEquals(5 ,numbers.getMaxNumber(3,5,5));
    }

}