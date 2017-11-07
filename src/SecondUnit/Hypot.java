package SecondUnit;

/**
 * Determination of length by using two catechisms
 * We use Pythagoras`es theorem
 * @author Ivan Homonets
 */

public class Hypot {

    /**
     * Main method which allows us to determinate hypotenuse
     */

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse is : " + z);
    }

}
