package ThirdUnit;


/**
 * This is main class for specific game.
 * User should guass one leter from keyboard.
 * @author Ivan Homonets
 * @version 2
 */

public class Guess2 {

    /**
     * This is main method in class Guess2. It includes class IoExeption
     * Hide leter is "S".
     */
    public static void main(String[] args)
    throws java.io.IOException {
        char answer; // variable, which contains answer leter 'S'
        answer = 'S';
        char ch;

        System.out.println("There is leter in range from A to Z ");
        System.out.print("Please, guess it ");
        ch = (char) System.in.read(); // We read leter from keyboard. This is users answer

        if (ch == answer) {
            System.out.println("This is right. You are winner! ");
        }
        else System.out.println("You lose. Sorry. Try again ");
    }
}
