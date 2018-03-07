package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {
        //V = Pi * r2 * h

        Scanner r =new Scanner(System.in);
        Scanner l =new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = l.nextDouble();

        System.out.println("Enter radius: ");
        double radius = r.nextDouble();

        double volume = 3.14 * (radius * radius) * length;
        System.out.println("The volume is:" + "" + volume);

        double area = (radius * radius) * 3.14;
        System.out.println("The area is: " + " " + area);




    }

}