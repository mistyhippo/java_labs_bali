package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {

        // A = L * W
        double area = 2.4 * 6.4;

        //P=2(l+w)
        double perimeter = 2 * (2.4 + 6.4);

        System.out.println(area);
        System.out.println(perimeter);
    }

}