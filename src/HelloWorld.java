/**
 * This is my first class "HelloWorld"
 * from learning book
 */

public class HelloWorld {

    /**
     * Main method that print phrase "Hello World"
     */
    public static void main (String[] args ) {

        for (int i = 2; i < 101; i++) {
            boolean a;
            a = true;
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) {
                    a = false;
                    //break;
                }


            if (a) {
                System.out.println("Digit " + i);
            }

        }

        System.out.println(" One \n Two \n Three");

    }
}
