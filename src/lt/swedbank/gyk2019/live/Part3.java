package lt.swedbank.gyk2019.live;

public class Part3 {
    public static void main(String[] args) {
        // Arithmetic Operators +,-,*,%,++,--
        int intVariable = 2 + 5;
        System.out.println(intVariable);
        System.out.println(2 / 5);

        int x = 1;
        System.out.println(++x);
        System.out.println(x);

        // Java Assignment Operators =, +=, *=
        int cats = 0;
        cats += 5;
        System.out.println(cats);

        // Java Comparison Operators == != > >=
        System.out.println(5 > 5);

        // Java Logical Operators && || !
        System.out.println(12 > 5 && 7 > 4);

        String firstCatName = "Muse";
        String secondCatName = "MuSE";
        System.out.println(firstCatName.equals(secondCatName));

        // Math library - abs, round, pow, random, sqrt, max, min
        System.out.println(Math.round(2.6));
        System.out.println(Math.abs(-5));
        System.out.println(Math.max(2, 6));
    }
}
