package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeedTestSuite {

Speed speed;
    @Before
    public void setUp()  {
        speed=new Speed();
    }

    @Test
    public void checkingThatValueOfSpeedConNotBeLessZero() {

        assertEquals(0.0 ,  speed.compareDifferentSpeedsAndOutputBigger(-10,10), 0.0);
    }
    @Test
    public void checkingComparingdefferentSpeed() {
        assertEquals(100 ,  speed.compareDifferentSpeedsAndOutputBigger(100,10), 0.0);
    }

}