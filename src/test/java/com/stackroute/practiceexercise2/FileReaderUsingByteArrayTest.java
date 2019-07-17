/**package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileReaderUsingByteArrayTest {
    FileReaderUsingByteArray fileReaderUsingByteArray;
    @BeforeClass
    public void setUp(){
//      This method runs even before the test cases and initialize the
//      variable with required value.
        fileReaderUsingByteArray = new FileReaderUsingByteArray();
    }

    @AfterClass
    public void tearDown() {
//      This method runs after the all test cases are executed and clears the
//      initialization of the variable
        fileReaderUsingByteArray = null;
    }

    @Test
    public void givenPathAndExtensionShouldReturnAByteArray() {
        /*
        To Test fileReader() method from FileReaderUsingByteArray whether it
        is returning the expected byte[] if we gave the valid path and extension.
         */
        /**byte[] expectedOutput = "This is the file with .txt extension".getBytes();
        assertArrayEquals(expectedOutput, fileReaderUsingByteArray.fileReader("text/raj", ".txt"));
    }

    @Test(expected = FileNotFoundException.class)
    public void givenPathAndExtensionShouldReturnFileNotFoundException() {
        /*
        To Test fileReader() method from FileReaderUsingByteArray whether it
        is returning the File Not Found Exception if we pass the path or extension
        which is not present.
         */
        //fileReaderUsingByteArray.fileReader("text/Raj", ".txt");
   // }

//}