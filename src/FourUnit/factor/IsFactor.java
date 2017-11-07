package FourUnit.factor;

/**
 * Class "IsFactor" contains method which checks
 * if first number is factor od second number.
 */
public class IsFactor {
    /**
     * This is method isFactor
     */
    boolean isFactor(int x, int y) {
        if (y % x == 0) { //here we check if mumber x is divider of "y"
            return true;
        } else return false;
    }
}
