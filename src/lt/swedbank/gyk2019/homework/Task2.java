package lt.swedbank.gyk2019.homework;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();

        double circleDiameter = radius * 2;
        double circlePerimeter = circleDiameter * Math.PI;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("Circle diameter: "+ circleDiameter);
        System.out.println("Circle perimeter is: " + circlePerimeter);
        System.out.println("Circle area is: " + circleArea);
    }
}
