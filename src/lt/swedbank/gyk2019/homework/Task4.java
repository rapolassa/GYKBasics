package lt.swedbank.gyk2019.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();

        double perimeter = (2*length) + (2*width);
        double area = length * width;

        System.out.println("Rectangle length and width are: " + length + ", " + width );
        System.out.println("Rectangle perimeter is: " + perimeter);
        System.out.println("Rectangle area is: " + Math.round(area));



    }
}
