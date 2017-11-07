package fiveUnit;

/**
 * In this class we demonstrate using two array.
 */
public class TwoD {
    public static void main(String[] args) {
        int i, t;
        int table[][] = new int[10][20];

        for (t = 0; t < 10; t++) {
            for (i = 0; i < 20; i++) {
                table[t][i] = (t * 4) + i + 1;
                System.out.println(table[t][i] + " ");

            }
            System.out.println();
        }
    }
}
