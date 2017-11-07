package ThirdUnit;

import java.io.IOException;

/**
 * This class is created for task 3.1 in book.
 * It shows us information about 'if' and 'switch'.
 * This is simple information system.
 */

public class Help {
    public static void main(String[] args) throws IOException {
        System.out.println("Informatoin : ");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Please, choose one: ");

        char choice; // Variable that contains answer
        choice = (char) System.in.read(); // We raed user`s answer

        switch (choice) {
            case '1' :
                System.out.println(" You chose <if> \n" +
                        "Construction is \n" +
                        "if (condition) operator \n" +
                        "else operator ");
                break;
            case '2' :
                System.out.println(" You chose <switch> \n" +
                        "Construction is: \n" +
                        "switch (expression) { \n" +
                        "case 1 : operators \n " +
                        "break \n" +
                        "case n : operators \n " +
                        "break \n" +
                        "defoult : operators");
                break;
            default:
                System.out.println("You have not made choise. \n" +
                        "Please, try again");
        }
    }
}
