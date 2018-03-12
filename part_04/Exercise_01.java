package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */
class Exercise_01{

    public static void main(String[] args) {
        // create scanner to receive input
        Scanner input = new Scanner(System.in);

        //syntax to create array and populate it with size. size is immutable
        int[] dogs = new int[10];

        // create a for loop to populate array with user input
        for(int i = 0 ; i < 10; i++){

            System.out.println("Enter a number:");
                  dogs[i] = input.nextInt();
        }
        //to get the 2nd index "i" needs to start at the second spot of the array which is "1"
        // count up by 2
        for(int i = 1; i < 10;i+=2){

            System.out.println(dogs[i]);

        }
        //to get the 9th integer you start "i" at the 8th index.
        //to reverse order decrement by 2
        for(int i =8; i >= 0; i-=2){

            System.out.println(dogs[i]);
        }
    }



}