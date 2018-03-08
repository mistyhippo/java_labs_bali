package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 999,999,99: ");
        int numChoice = input.nextInt();


        // use the && operator to see if the user's number is divisible by both 4 and 7


        if ((numChoice % 4 == 0) && (numChoice % 7 == 0)) {
            System.out.println("number is divisible by 4 and 7");
        }
        // use the || operator to see if the user's number is divisible by 4 or 7

        if ((numChoice % 4 == 0) || (numChoice % 7 == 0)) {
            System.out.println("number is divisible by 4 or 7");

        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively


        if ((numChoice % 4 == 0) ^ (numChoice % 7 == 0)) {
            System.out.println("number is divisible by 4 or 7 but not both");
            // print out the results

        }


    }
}
