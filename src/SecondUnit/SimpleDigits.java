package SecondUnit;

/**
 * This class is using for looking for simple digits in range from 2 to 100.
 * @author Ivan Homonets
 */

public class SimpleDigits {

    /**
     * This is main method. It contains two cycles.
     */
    public static void main(String[] args) {
        boolean a;

        for (int i = 2; i <= 100; i++) {
            a = true; // Every iteration we put "true" in a.

            for (int j = 2; j < i; j++) {
                if ((i%j) == 0) {
                    a = false;
                }
            }
            if (a) {
                System.out.println("This is simple digit : " + i);
            }
        }
    }
}
