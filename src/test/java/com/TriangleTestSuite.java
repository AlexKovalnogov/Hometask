package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TriangleTestSuite {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }

    @Test
    public void checkingThatTriangleIsRightAngled() {
        assertTrue(triangle.isRightAngledTriangle(3, 4, 5));
    }

    @Test
    public void checkingThatTriangleIsNotRightAngled() {
        assertTrue(!triangle.isRightAngledTriangle(3, 6, 5));
    }

    @Test
    public void checkingThatLengthOfSideMoreZero() {
        assertTrue(!triangle.isLengthOfSidesMoreZero(-5, 5, 6));
    }

    @Test
    public void checkingThatLengthOfSideCantEquelZero() {
        assertTrue(!triangle.isLengthOfSidesMoreZero(0, 5, 6));
    }

    @Test
    public void checkingThatTriangleIsNotExist() {
        assertTrue(!triangle.isTriangleExsist(5, 4, 10));
    }

    @Test
    public void checkingThatTriangleExists() {
        assertTrue(triangle.isTriangleExsist(5, 6, 10));
    }


}