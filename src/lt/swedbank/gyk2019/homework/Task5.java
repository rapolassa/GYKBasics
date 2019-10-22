package lt.swedbank.gyk2019.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int integerNumber = scanner.nextInt();

        int firstDigit = integerNumber / 100;
        int secondDigit = integerNumber / 10 % 10;
        int thirdDigit = integerNumber % 10;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int multiplicationOfDigits = firstDigit * secondDigit * thirdDigit;

        System.out.println("Sum of digits - " + sumOfDigits);
        System.out.println("Multiplication of digits - " + multiplicationOfDigits);
    }
}
