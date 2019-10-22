package lt.swedbank.gyk2019.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double[] studentGrades = new double[3];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first grade: ");
        studentGrades[0] = scanner.nextDouble();
        System.out.print("Enter second grade: ");
        studentGrades[1] = scanner.nextDouble();
        System.out.print("Enter third grade: ");
        studentGrades[2] = scanner.nextDouble();

        double studentGradesSum = studentGrades[0] + studentGrades[1] + studentGrades[2];
        double studentGradesAverage = studentGradesSum / studentGrades.length;

        System.out.println("Average of student grades : " + studentGradesAverage);
    }
}
