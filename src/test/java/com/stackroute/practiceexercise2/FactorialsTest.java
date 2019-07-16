package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialsTest {
    Factorials factorials;
    @BeforeClass
    public void setUp (){
        factorials = new Factorials();
    }

    @AfterClass
    public void tearDown() {
        factorials = null;
    }

    @Test
    public void givenIntShouldReturnTheFactorialOfThatNUmber() {
        assertEquals(3628800, factorials.listOfIntFactorials(10));
        assertEquals(1, factorials.listOfIntFactorials(0));
        assertEquals(120, factorials.listOfIntFactorials(5));
    }

    @Test
    public void givenIntShouldReturnFailureValue() {
        assertEquals(-1, factorials.listOfIntFactorials(16));
        assertEquals(-1, factorials.listOfIntFactorials(13));
    }

    @Test
    public void givenLongShouldReturnTheFactorialOfThatNUmber() {
        assertEquals(6227020800L, factorials.listOfIntFactorials(13));
        assertEquals(1, factorials.listOfIntFactorials(0));
        assertEquals(2432902008176640000L, factorials.listOfIntFactorials(20));
    }

    @Test
    public void givenLongShouldReturnFailureValue() {
        assertEquals(-1, factorials.listOfIntFactorials(26));
    }



}