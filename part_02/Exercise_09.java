package part_02;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */

    /*  do{
            System.out.println("x is: " + x);
            x++;
        } while(x < 11);    */

public class Exercise_09 {

    public static void main(String[] args) {

        char i = 'z';

        do {
            System.out.println(i);
            i--;
        } while (i >= 'a');


    }
}


