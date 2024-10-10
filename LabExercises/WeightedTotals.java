package LabExercises;

import java.util.*;

public class WeightedTotals {
    public static double getScores(int numberOfTests, String testType, Scanner scanner) {
        double totalScores = 0;

        for (int i = 0; i < numberOfTests; i++) {
            System.out.printf("Enter the [%s] score: ", testType);
            double score = scanner.nextDouble();
            totalScores += score;
        }
        // Return the values - Side effects (A lot of mutation)
        return totalScores;
    }

    public static char getFinalGrade(double weightedAverage) {
        char grade;
        if (weightedAverage > 90) {
            grade = 'A';
        } else if (weightedAverage > 80) {
            grade = 'B';
        } else if (weightedAverage > 70) {
            grade = 'C';
        } else if (weightedAverage > 50) {
            grade = 'D';
        } else if (weightedAverage > 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2 Tests worth 50%, 10 labs worth 30%, 8 quizzes worth 10%, 3 assignments worth 10%
        double testScore = getScores(2, "Test Scores", input);
        double labScores = getScores(10, "Lab Scores", input);
        double quizScores = getScores(8, "Quiz Scores", input);
        double assignments = getScores(3, "Assignment Scores", input);

        double testAverage = (testScore / 2) * 0.5;
        double labAverage = (labScores / 10) * 0.3;
        double quizAverage = (quizScores / 8) * 0.1;
        double assignmentAverage = (assignments / 3) * 0.1;

        System.out.println("test average: " + testAverage);
        System.out.println("lab average: " + labAverage);
        System.out.println("Quiz average: " + quizAverage);
        System.out.println("Assignment average: " + assignmentAverage);

        double weightedAverage = testAverage + labAverage + quizAverage + assignmentAverage;
        char finalGrade = getFinalGrade(weightedAverage);
        System.out.println("Final grade: " + finalGrade);
    }
}
