package com.stackroute.practiceexercise2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {

    StudentGrades studentGrades;
    @BeforeClass
    public void setUp () {
        studentGrades = new StudentGrades();
    }

    @AfterClass
    public void tearDown() {
        studentGrades = null;
    }

    @Test
    public void givenArrayShouldReturnTheAverageGrade() {
        int[] grades = {70, 80, 90, 60, 100};
        studentGrades.initializer(grades);
        assertEquals(80, studentGrades.averageCalculator());
    }

    @Test
    public void givenArrayShouldReturnTheMinimumGrade() {
        int[] grades = {70, 80, 90, 60, 100};
        studentGrades.initializer(grades);
        assertEquals(60, studentGrades.minimumGradeCalculator());
    }

    @Test
    public void givenArrayShouldReturnTheMaximumGrade() {
        int[] grades = {70, 80, 90, 60, 100};
        studentGrades.initializer(grades);
        assertEquals(100, studentGrades.maximumGradeCalculator());
    }


}