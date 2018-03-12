package part_04;

/**
 * Create, populate, and print out a two-dimensional array that will show the following output:
 * <p>
 * 0 1 2 3 4 5 6 7 8 9
 * 10 11 12 13 14 15 16 17 18 19
 * 20 21 22 23 24 25 26 27 28 29
 * 30 31 32 33 34 35 36 37 38 39
 * 40 41 42 43 44 45 46 47 48 49
 */

public class Exercise_03 {

    public static void main(String[] strings) {

        //the first number of an array is the number in the column. the second number is the number of rows.
        int[][] numGrid = new int[5][10];

        int count = 0;
            // these for loops populates the arrays and sets them equal to count variable
        for (int i = 0; i < numGrid.length; i++) {

            for (int x = 0; x < numGrid[i].length; x++) {

                numGrid[i][x] = count;

                count++;

            }
        }
        for (int i = 0; i < numGrid.length; i++) {


            for (int x = 0; x < numGrid[i].length; x++) {
                // makes sure to print side by side. adds a space between each number
                System.out.print(numGrid[i][x] + " ");

            }
            // create a line break after the outer for loop to format
            System.out.println();
        }


    }
}