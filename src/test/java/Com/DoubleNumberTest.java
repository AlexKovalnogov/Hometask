package Com;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DoubleNumberTest {

    @Test
    public void functionDoubleNumberCase1() {
        DoubleNumber doubleNumber = new DoubleNumber();
assertEquals("77",doubleNumber.getDoubleNumber(7));
    }
    @Test
    public void functionDoubleNumberCase2() {
        DoubleNumber doubleNumber = new DoubleNumber();
        assertEquals("00",doubleNumber.getDoubleNumber(0));
    }

    @Test
    public void functionDoubleNumberCase3() {
        DoubleNumber doubleNumber = new DoubleNumber();
        assertEquals("77",doubleNumber.getDoubleNumber(-7));
    }



}