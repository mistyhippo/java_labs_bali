package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner f =new Scanner(System.in);

        System.out.println("Enter a number in feet:");

        double feet = f.nextDouble();

        double meters = feet * .305;

        System.out.println(feet + "in feet equals" + meters + " "+ "in meters");

    }
}