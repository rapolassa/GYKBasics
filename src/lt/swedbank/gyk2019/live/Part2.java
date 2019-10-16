package lt.swedbank.gyk2019.live;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        // BOXING
//        Integer intVariable = new Integer(23);
        // AUTOBOXING
        Integer intVariable = 23;
//        Integer intVariable = Integer.valueOf(23);

        // UNBOXING
        int intPrimitive = intVariable.intValue();

        // STRING
        String carColor = "Red";
        System.out.println(carColor.length());
        System.out.println(carColor.toUpperCase());
        System.out.println(carColor.toLowerCase());
        System.out.println(carColor.concat(" purple"));

        // SMALL TASK
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your lastname: ");
        String lastname = scanner.next();
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(lastname));
    }
}

