package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        //days = minutes ÷ 1,440
        //minutes in year = 60 * 24 * 365

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number between one and 1,000,000,000: ");
        int minutes = scanner.nextInt();
        int year = 60 * 24 * 365;
        int years = minutes * year;
        int days = minutes/ 1440;
        System.out.println("Years equals:" + years);
        System.out.println("Days equals:" + days);

    }

}




