package lt.swedbank.gyk2019.homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        int days = seconds / 3600 / 24;
        int daysInSeconds = days * 3600 * 24;
        int hours = (seconds - daysInSeconds) / 3600;
        int hoursInSeconds = hours * 3600;
        int minutes = (seconds - daysInSeconds - hoursInSeconds) / 60;
        int secondsLeft = (seconds - daysInSeconds - hoursInSeconds) - minutes * 60;

        System.out.println("Days - "+ days);
        System.out.println("Hours - " + hours);
        System.out.println("Minutes - " + minutes);
        System.out.println("Seconds - " + secondsLeft);
    }
}