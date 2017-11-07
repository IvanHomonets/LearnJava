package ThirdUnit;

/**
 * This program is created for digit`s power from 0 to 9.
 */
public class Pover {
    /**
     * This is main method which contains two sicles: while and for
     */

    public static void main(String[] args) {
        int power = 1;
        int fact = 1;
        int e;

        for (int i = 0; i <= 9; i++) {
            e = i;

            while (e > 0) {
                power *= 2; // Making power
                fact *= i; // Making factorial
                e--;
            }
            System.out.println(" Fact of " + i + " = " + fact);
            System.out.println(" Power of " + i + " = " + power);
        }
    }
}
