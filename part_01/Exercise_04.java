package part_01;

 /**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   2   4
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {

     public static void main(String[] args) {
            int i;
            int j;
         for (i = 1; i < 5; i++){
             for (j =1; j < 5; j++){
                 System.out.print(i * j + " ");
             }

             System.out.print("\n");

         }

     }


}

