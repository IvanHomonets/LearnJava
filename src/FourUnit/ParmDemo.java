package FourUnit;

/**
 * Class ParmDemo contains main method and instance of CheckNum.
 */
public class ParmDemo {

    /**
     * This method is begining program.
     */
    public static void main(String[] args) {

        /**
         * Here we create an instance of CheckNum class.
         */
        //CheckNum checkNum = new CheckNum();

        if (CheckNum.isEven(8)) {
            System.out.println("8 is " + " even");
        }
        if (CheckNum.isEven(7)) {
            System.out.println("9 is " + " not even");
        }

    }

}
