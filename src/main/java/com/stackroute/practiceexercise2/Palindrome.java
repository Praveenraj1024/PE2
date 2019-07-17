package com.stackroute.practiceexercise2;


public class Palindrome {
    public String isPalindrome(String inputString) {

        String reverseString = "";
        String resultString;

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }

        if (reverseString.matches(inputString)) {
            resultString = "Given string is a palindrome";
        } else {
            resultString = "Given string is not a palindrome";
        }
        return resultString;
    }

    public String isPalindrome(int inputNumber) {

        return "Only give positive numbers greater than 0";
    }
}
