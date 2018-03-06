package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        //Seconds in a year = 31557600
        double secondsInYear = 31557600;

        // born every 6 seconds;
        int b;

        //dies every 12 seconds;
        int d;

        //immigrates every 40 seconds;
        int i;

        //population = 380123456;
        double population = 380123456;

        for (b = 0; b <= 380123456; b+=6) {

            population++;

        }

        for (d = 0; d <= 380123456; d+=12){

            population--;
        }

        for (i = 0; i <=380123456; i+=40){

            population++;

        }
        System.out.println(population);
    }

}