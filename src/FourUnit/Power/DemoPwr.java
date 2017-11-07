package FourUnit.Power;

import java.awt.event.PaintEvent;

/**
 * This class contains main method.
 * Also we created three objects with parameters.
 */
public class DemoPwr {
    public static void main(String[] args) {
        Pwr first_number = new Pwr(0.0, 4);
        Pwr second_number = new Pwr(1.0, 5);
        Pwr third_number = new Pwr(2.0, 4);

        // Let`s print information about our numbers
        System.out.println(first_number.b + " in power "+ first_number.e+ " equels " + first_number.getPwr());
        System.out.println(second_number.b + " in power "+ second_number.e+ " equels " + second_number.getPwr());
        System.out.println(third_number.b + " in power "+ third_number.e+ " equels " + third_number.getPwr());
    }

}
