package ThirdUnit;

import java.io.IOException;



/**
 * This class demonstrates work principle of "do-while" cicle.
 */
public class DWDemo {
    public static void main(String[] args) throws java.io.IOException{
        char ch;

        do {
            System.out.print("Enter letter ");
            ch = (char) System.in.read();
        }while (ch != 'q');
    }
}
