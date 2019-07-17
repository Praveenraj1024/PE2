package com.stackroute.practiceexercise2;

public class EvenNumTest {

    public static boolean isEven(int inputNumber) {

        boolean result = false;
        while(inputNumber>=0) {
            if (inputNumber % 2 == 0) {
                result = true;
            }
        }
        return result;
    }

}
