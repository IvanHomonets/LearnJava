package FourUnit.factor;

/**
 * This is doing class. It contains instance of class "IsFactor"
 */
public class Factor {
    public static void main(String[] args) {
        IsFactor isFactor = new IsFactor();

        if (isFactor.isFactor(2, 20)) {
            System.out.println("2 is a dividor");
        }
        if (isFactor.isFactor(3, 20)) {
            System.out.println("It wont print");
        }
    }
}
