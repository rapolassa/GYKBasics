package lt.swedbank.gyk2019.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("What’s your name?");
        String name = scanner.nextLine();
        System.out.println("What’s your surname?");
        String surname = scanner.nextLine();
        System.out.println("What’s your work area?");
        String workArea = scanner.nextLine();
        System.out.println("How many years you been working in it?");
        double workExperience = scanner.nextDouble();

        System.out.println("Hello, I'm "+ name + " " + surname + " and I work in " + workArea + " for " + workExperience + " years." );
    }
}
