package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    WordFrequency wordFrequency;

    @BeforeClass
    public void setUp() {
        wordFrequency = new WordFrequency();
    }

    @AfterClass
    public void tearDown() {
        wordFrequency = null;
    }

    @Test
    public void givenPathShouldReturnTheWordFrequencyOfThatFile() {
        Map<String, Integer> wordFrequencyMap = new HashMap<String, Integer>();
        wordFrequencyMap.put("i", 3);
        wordFrequencyMap.put("am", 1);
        wordFrequencyMap.put("like", 1);
        wordFrequencyMap.put("have", 1);
        wordFrequencyMap.put("a", 2);
        wordFrequencyMap.put("to", 1);
        wordFrequencyMap.put("man", 1);
        wordFrequencyMap.put("sleep", 1);
        wordFrequencyMap.put("home", 1);
        assertEquals(wordFrequency, wordFrequency.wordFrequencyChecker("test_files/FileDemo.txt"));
    }

    @Test
    public void givenPathShouldReturnNull() {
        assertNull(wordFrequency.wordFrequencyChecker("test_file/FileDemo.txt"));
    }

}