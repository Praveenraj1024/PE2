package com.stackroute.practiceexercise2;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void givenIntegerShouldReturnFalse() {
        /*
        To Test the isEven() method from EvenNumTest class whether it is
        returning false if we pass odd number.
         */
        //assert
        assertFalse(EvenNumTest.isEven(3));
        assertFalse(EvenNumTest.isEven(-1));
    }

    @Test
    public void givenIntegerShouldReturnTrue() {
        /*
        To Test the isEven() method from EvenNumTest class whether it is
        returning true if we pass even number.
         */
        //assert
        assertTrue(EvenNumTest.isEven(0));
        assertTrue(EvenNumTest.isEven(90));
    }

    @Test(expected = InvalidParameterException.class)
    public void givenCharacterShouldReturnInvalidParameterException() {
        /*
        To Test the isEven() method from EvenNumTest class whether it is
        returning an Invalid Parameter exception if we pass character to it.
         */
        EvenNumTest.isEven(' ');
    }

    @Test(expected = InvalidParameterException.class)
    public void givenStringShouldReturnInvalidParameterException() {
        /*
        To Test the isEven() method from EvenNumTest class whether it is
        returning an Invalid Parameter Exception if we pass String to it.
         */
        EvenNumTest.isEven(Integer.parseInt("rttd"));
    }

    @Test(expected = NullPointerException.class)
    /*
    To Test the isEven() method from EvenNumTest class whether it is
    returning an Null Pointer Exception if we pass null to it.
     */
    public void givenCharacterShouldReturnNullPointerException() {
        //act
        EvenNumTest.isEven(Integer.parseInt(null));

    }
}