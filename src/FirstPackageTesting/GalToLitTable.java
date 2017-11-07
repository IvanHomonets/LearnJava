package FirstPackageTesting;

/**
 * Exercise 1.2
 * This class show table with galons and liters
 * @author Ivan Homonets
 */

public class GalToLitTable {
    /**
     * Method which prints table with information
     */
    public static void main(String[] args) {
        double galon;
        double liters;
        int counter;

        galon = 3.7848; //Meaning of one galon in liters

        System.out.println("Table");
        System.out.println();
        counter = 0;
        for (int galons = 1; galons < 101; galons++) {
            liters = galons*galon;
            System.out.println(galons + " : " + liters);
            counter++;


            if(counter == 10){
                System.out.println();
                counter = 0; //Throw down the meaning of counter

            }
        }
    }
}
