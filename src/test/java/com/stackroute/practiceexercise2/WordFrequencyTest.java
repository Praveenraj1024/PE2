/**package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    WordFrequency wordFrequency;

    @BeforeClass
    public void setUp() {
//      This method runs even before the test cases and initialize the
//      variable with required value.
        wordFrequency = new WordFrequency();
    }

    @AfterClass
    public void tearDown() {
//      This method runs after the all test cases are executed and clears the
//      initialization of the variable
        wordFrequency = null;
    }

    @Test
    public void givenPathShouldReturnTheWordFrequencyOfThatFile() {
        /*
        To Test the wordFrequencyChecker() method from WordFrequency class
        whether it is returning the expected TreeMap if we pass the valid path
        for the file.
         */
        /**Map<String, Integer> wordFrequencyMap = new TreeMap<String, Integer>();
        wordFrequencyMap.put("i", 3);
        wordFrequencyMap.put("am", 1);
        wordFrequencyMap.put("like", 1);
        wordFrequencyMap.put("have", 1);
        wordFrequencyMap.put("a", 2);
        wordFrequencyMap.put("to", 1);
        wordFrequencyMap.put("man", 1);
        wordFrequencyMap.put("sleep", 1);
        wordFrequencyMap.put("home", 1);
        //assertEquals(wordFrequencyMap, wordFrequency.wordFrequencyChecker("text/FileDemo.txt"));
    }

    @Test(expected = FileNotFoundException.class)
    public void givenPathShouldReturnFileNotFoundException() {
        /*
        To Test the wordFrequencyChecker() method from WordFrequency class
        whether it is returning File Not Found Exception if we pass the
        path which is not available.
         */
        //wordFrequency.wordFrequencyChecker("test/FileDemo.txt");
   // }

//}