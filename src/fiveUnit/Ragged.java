package fiveUnit;

/**
 * In this class we demonstrate how to create two array
 * with different second meaning.
 */
public class Ragged {
    public static void main(String[] args) {
        int riders[][] = new int[7][]; // Let`s define common array

        //Put a special meaning into every row
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        // Let`s put meaning in table
        for (int i = 0; i < riders.length; i++) {
            for (int j = 0; j < riders[i].length; j++) {
                if (i < 5) { // For the first 5 days we generate less passengers
                    riders[i][j] = (5 * i) + j + 1;
                } else {
                    riders[i][j] = (5 * i) + j;
                }
            }

        }
        // Here we print information about work days
        System.out.println(" Number of passengers which bus could ride in work day");

        for (int i = 0; i < riders.length; i++) {
            for (int j = 0; j < riders[i].length; j++) {
                System.out.println(" Day " + (i + 1) + " trip " +
                        (j + 1) + " : " + riders[i][j] + " passengers");

            }
            System.out.println("========================");
        }

    }
}
