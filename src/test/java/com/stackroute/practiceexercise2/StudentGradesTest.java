package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {

    StudentGrades studentGrades;
    @BeforeClass
    public void setUp () {
//      This method runs even before the test cases and initialize the
//      variable with required value.
        studentGrades = new StudentGrades();
    }

    @AfterClass
    public void tearDown() {
//      This method runs after the all test cases are executed and clears the
//      initialization of the variable
        studentGrades = null;
    }

    @Test
    public void givenArrayShouldReturnTheAverageGrade() {
        /*
        To Test the averageCalculator() method from StudentGrades whether it
        is returning the expected average of given input array.
         */
        int[] grades = {70, 80, 90, 60, 100};
        studentGrades.initializer(grades);
        assertEquals(80, studentGrades.averageCalculator());
    }

    @Test
    public void givenArrayShouldReturnTheMinimumGrade() {
        /*
        To Test the minimumGradeCalculator() method from StudentGrades whether it
        is returning the expected minimum grade value of given input array.
         */
        int[] grades = {70, 80, -90, 60, 100};
        studentGrades.initializer(grades);
        assertEquals(-90, studentGrades.minimumGradeCalculator());
    }

    @Test
    public void givenArrayShouldReturnTheMaximumGrade() {
        /*
        To Test the maximumGradeCalculator() method from StudentGrades whether it
        is returning the expected maximum grade value of given input array.
         */
        int[] grades = {70, 80, 90, 60, -100};
        studentGrades.initializer(grades);
        assertEquals(90, studentGrades.maximumGradeCalculator());
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNullPointerException() {
        /*
        To Test the averageCalculator() method from StudentGrades whether it
        is returning the Null Pointer Exception if we pass null as a value to it.
         */
        studentGrades.averageCalculator(null);
    }

}