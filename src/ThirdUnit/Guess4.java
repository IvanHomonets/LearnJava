package ThirdUnit;

/**
 * This is game where user should guess letter.
 * @version 4
 * @author Ivan Homonets
 */

public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        char ignore;
        char answer;
        answer = 'S'; // This is right letter.

        do {
            System.out.print("There is leter in range from A to Z, guess it \n ");
            ch = (char) System.in.read(); //We get symbol from keyboard.
            do {
                ignore = (char) System.in.read();
            }
            while (ignore != '\n');

            // Here we check user`s answer.
            if (ch == answer) {
                System.out.println("Welcome. You are winner ");
            }
            // User`s answer isn`t right. We check where is letter.
            else {
                System.out.println("Your answer is not correct");
                if (ch < answer) {
                    System.out.println("Answer letter is closer to end Alphabet");
                    System.out.println("Pleae, try to gues it again \n ");
                }
                else {
                    System.out.println("Your answer is closer to start of Alphabet");
                    System.out.println("Please, try to guess again \n ");
                }
            }
        }
        while (ch != answer);

    }
}
