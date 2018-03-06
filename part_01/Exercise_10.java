package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {
        // speed = distance / time

        double time =  30.5;
        double miles =  12 * .621;
        double total = miles / time;



        System.out.println(total);

    }
}