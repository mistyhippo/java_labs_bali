
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {
        // you can use the same scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an investment amount: ");
        double principle = scanner.nextDouble();

        System.out.println("Enter a rate: ");
        double rate = scanner.nextDouble();
        // turn into percentage
         rate = rate/100;

        System.out.println("Enter number of years: ");
        double years = scanner.nextDouble();


        double total = calculateTotal(principle, rate, years);

        System.out.println("You made dis much monies: "+total);

    }
            //remember to put "static" in front of method
        static double calculateTotal(double principle, double rate, double years){

       double total = principle * Math.pow(1 + (rate / 12),(years * 12));
                return total;
    }
}



