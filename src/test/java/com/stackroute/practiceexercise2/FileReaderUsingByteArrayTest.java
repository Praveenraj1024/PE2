package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileReaderUsingByteArrayTest {
    FileReaderUsingByteArray fileReaderUsingByteArray;
    @BeforeClass
    public void setUp(){
        fileReaderUsingByteArray = new FileReaderUsingByteArray();
    }

    @AfterClass
    public void tearDown() {
        fileReaderUsingByteArray = null;
    }

    @Test
    public void givenFileNameAndExtensionShouldReturnAByteArray() {
        byte[] expectedOutput = "This is the file with .txt extension".getBytes();
        assertArrayEquals(expectedOutput, fileReaderUsingByteArray.filereader("raj", ".txt"));

    }

    @Test(expected = FileNotFoundException.class)
    public void givenFileNameAndExtensionShouldReturnFileNotFoundException() {
        fileReaderUsingByteArray.filereader("Raj", ".txt");
    }

}