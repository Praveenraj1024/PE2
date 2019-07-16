package com.stackroute.practiceexercise2;

public class StudentGrades {

    public void initializer(int[] grades) {
        int[] inputGrades = grades;
    }

    public double averageCalculator(int[] inputGrades) {

        double average ;
        int sum = 0;
        int i = 0;
        for(i =0; i <= inputGrades.length-1; i++)
        {
            sum += inputGrades[i];
        }
        average = sum/i;
        return average;
    }

    public float minimumGradeCalculator(int[] inputGrades) {
        int minimumValue = inputGrades[0];

        for(int i=1;i<inputGrades.length;i++){
            if(inputGrades[i] < minimumValue){
                minimumValue = inputGrades[i];
            }
        }
        return minimumValue;
    }

    public float maximumGradeCalculator(int[] inputGrades) {
        int maximumValue = inputGrades[0];

        for(int i=1;i<inputGrades.length;i++){
            if(inputGrades[i] > maximumValue){
                maximumValue = inputGrades[i];
            }
        }
        return maximumValue;
    }


}
