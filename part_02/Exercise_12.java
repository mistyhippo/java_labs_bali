package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of miles driven: ");
        double miles = scanner.nextDouble();

        System.out.println("Enter the MPG of the car: ");
        double MPG = scanner.nextDouble();

        System.out.println("Enter the price per gallon of fuel: ");
        double price = scanner.nextDouble();

        //double total = distance / milesPerGallon * pricePerGallon;

        double total = miles / MPG * price;

        System.out.println("The cost of this trip is: $" + total);

    }

}