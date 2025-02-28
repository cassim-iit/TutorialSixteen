package com.iit.tutorials.tutorialsixteen;

public class LabSheetSixteen {
    public String fibinociiSeries(int N) {
        int num1 = 0, num2 = 1;
        String result = "";
        for (int i = 0; i < N; i++) {
            // build the result
            result += num1 + " ";
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        return result;
    }

    public String calculateGrade(int mark) {
        String finalGrade = "Fail";
        if ((mark >= 0) && (mark < 45)) {
            finalGrade = "F";
        } else if ((mark >= 45) && (mark < 50)) {
            finalGrade = "D";
        } else if ((mark >= 50) && (mark < 60)) {
            finalGrade = "C";
        }

        return finalGrade;

    }
}
