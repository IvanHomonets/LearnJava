package SecondUnit;

/**
 * Demonstration of living of variable
 * @author Ivan Homonets
 */

public class VarInitDemo {

    /**
     * Main method
     */
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // Variable y is inicialozing when we enter into block
            System.out.println("y: " + y); //Always it will be print "-1"
            y = 100;
            System.out.println("Changed meaning of y: " + y);


        }
    }
}
