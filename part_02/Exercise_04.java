package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // kg = lbs/2.2046

        Scanner scPounds =new Scanner(System.in);

        System.out.println("Enter a number in pounds to convert:");
        double pounds = scPounds.nextDouble();
        System.out.println("You entered:" + " "+ pounds);

        double kilograms = pounds/2.2046;
        System.out.println("The conversion to kilograms is:" + " " + kilograms);



    }
}