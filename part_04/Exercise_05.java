package part_04;

/**
 * Here's an easy one for you.
 * <p>
 * Create and populate an array with a length no less than 5. Use the enhanced for
 * loop to iterate through the array and print out each value.
 */


public class Exercise_05 {

    public static void main(String[] strings) {

        int[]  numArray = {2, 4, 6 , 8, 10};

        int sum = 0;

        for (int outpost: numArray) {

            sum += outpost;
        }

        System.out.println(sum);
        System.out.println();

        String[] arrayName = {"Chicken", "Noodles", "Beef", "Rice", "Nasi Goreng"};

        // declare string variable food and attach to array
        for (String food : arrayName) {

            System.out.println(food);
        }


    }
}