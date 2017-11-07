package FourUnit.Vehicle;

/**
 * This class contains, fields and two methods:
 * range and fuelneeded
 *
 * @author Ivan
 * @version 1.0
 */
public class Vehicle {
    int passengers;
    int fuel;
    int fpm;
    double gallons;

    /**
     * This is constructor of class Vehicle
     */
    Vehicle (int p, int fu, int fp) {
        passengers = p;
        fuel = fu;
        fpm = fp;
    }

    /**
     * This is method #range
     *
     * @return fuel*fpm
     */
    int range() {
        return fuel * fpm;
    }

    /**
     * This is method fuelneeded.
     *
     * @return meaning of gallons, which car needs to go
     */
    double fuelNeeded (int dist) {
        if (dist!=0){
            gallons = (double) (dist/fpm); //Here we count gallons
        }
        return gallons;
    }

}
