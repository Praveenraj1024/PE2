/**package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class FactorialsTest {
    Factorials factorials;
    @BeforeClass
    public void setUp (){
//      This method runs even before the test cases and initialize the
//      variable with required value.
        factorials = new Factorials();
    }

    @AfterClass
    public void tearDown() {
//      This method runs after the all test cases are executed and clears the
//      initialization of the variable
        factorials = null;
    }

    @Test
    public void givenIntShouldReturnTheFactorialOfThatNUmber() {
        /*
        To Test factorialGeneratorForInt() method from Factorial class whether
        it is returning the expected factorial of that number if the passed
        value is with in the range.
         */
        /**assertEquals(3628800, factorials.factorialGeneratorForInt(10));
        assertEquals(1, factorials.factorialGeneratorForInt(0));
        assertEquals(120, factorials.factorialGeneratorForInt(5));
    }

    @Test
    public void givenIntShouldReturnFailureValue() {
        /*
        To Test factorialGeneratorForInt() method from Factorial class whether
        it is returning -1 if we pass the value whose factorial answer will be
        more than int range.
         */
        /**assertEquals(-1, factorials.factorialGeneratorForInt(16));
        assertEquals(-1, factorials.factorialGeneratorForInt(13));
    }

    @Test
    public void givenLongShouldReturnTheFactorialOfThatNUmber() {
        /*
        To Test factorialGeneratorForLong() method from Factorial class whether
        it is returning the expected factorial of that number if the passed
        number's factorial value is with in the range of long.
         */
        /**assertEquals(6227020800L, factorials.factorialGeneratorForLong(13));
        assertEquals(1, factorials.factorialGeneratorForLong(0));
        assertEquals(2432902008176640000L, factorials.factorialGeneratorForLong(20));
    }

    @Test
    public void givenLongShouldReturnFailureValue() {
        /*
        To Test factorialGeneratorForLong() method from Factorial class whether
        it is returning -1 if we pass the long value whose factorial is not with
        in the range of long.
         */
        /**assertEquals(-1, factorials.factorialGeneratorForLong(26));
    }


    @Test(expected = InvalidParameterException.class)
    public void givenStringShouldReturnInvalidParameterException() {
        /*
        To Test factorialGeneratorForInt() and factorialGeneratorForLong() method
        in Factorial class whether it is returning an Invalid Parameter Exception
        if we pass the String as value to it.
         */
       /** factorials.factorialGeneratorForInt("Three");
        factorials.factorialGeneratorForLong("Thirty");
    }

    @Test(expected = NullPointerException.class)
    public void givenCharacterShouldReturnInvalidParameterException() {
        /*
        To Test factorialGeneratorForInt() and factorialGeneratorForLong() method
        in Factorial class whether it is returning an Null Pointer Exception
        if we pass null as value to it.
         */
        /**factorials.factorialGeneratorForInt(null);
        factorials.factorialGeneratorForLong(null);
    }
}*/