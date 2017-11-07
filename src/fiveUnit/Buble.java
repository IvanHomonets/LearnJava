package fiveUnit;

import java.util.ArrayList;

/**
 * This class is used for sorting by 'Buble sort'
 */
public class Buble {
    public static void main(String[] args) {
        int array[] = {0, 1, 1, 10, 4, 5, 6, 7, 7}; // It`s our arraywhich we need to sort

        // This is an algorithm of 'Buble sort'
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }

            }

        }
        // Here we print sorted array.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
