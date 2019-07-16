package com.stackroute.practiceexercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    /*
        Create a method which accepts int value and return
        true if the accepted number is true

     */

    @Test
    public void givenIntegerShouldReturnFalse() {
        //assert
        assertFalse(EvenNumTest.isEven(3));
        assertFalse(EvenNumTest.isEven(-1));
    }

    @Test
    public void givenIntegerShouldReturnTrue() {
        //assert
        assertTrue(EvenNumTest.isEven(0));
        assertTrue(EvenNumTest.isEven(90));
    }

}