package lt.swedbank.gyk2019.live;

import java.util.Scanner;

public class Part1 {
    // CONSTANT
    public static final int DAYS_IN_WORK = 5;

    public static void main(String[] args) {
        // PRIMITIVE VARIABLES
        byte byteVariable = 127;
        short rimHeight = 10;
        int doorCount = 5;
        long seconds = 100056;
        float pi = 3.14f;
        double money = 150.56;
        boolean isCarAvailable = true;
        char firstAlphabetLetter = 65;
        System.out.println(firstAlphabetLetter);

        // CASTING - CASE 1
        double doubleVariable = doorCount;
        System.out.println(doubleVariable);

        // CASTING - CASE 2
        int intVariable = (int) money;
        System.out.println(intVariable);

        // INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int variable: ");
        int fruitCount = scanner.nextInt();
        System.out.println(fruitCount);

        // OUTPUT
        System.out.println(fruitCount);
        System.out.print(fruitCount);
    }
}
