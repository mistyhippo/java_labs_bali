package part_04;


import java.util.Scanner;

/**
 * The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
 * The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
 * the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
 * Keep all other members of the Stack class private.
 */

class Stack {

    //declaration of array
    private char[] myArray;

    private int index = 0;

    public int getSize() {
        return index;
    }

    // constructor for stack class
    // you cant have a private constructor
    public Stack(int sizeOfArray) {

        //initializing array
        // this will hold the letters that the user gives us
        myArray = new char[sizeOfArray];

    }


    public void push(char value) {

        myArray[index] = value;

        index++;
    }

    public char pop() {

        char temp = myArray[index - 1];

        index--;

        return temp;

    }


}

class stackTester {

    public static void main(String[] args) {

        // created a stack that can hold 26 characters
        Stack myStack = new Stack(26);


        for (char i = 'a'; i <= 'z'; i++) {

            myStack.push(i);

        }

        while (myStack.getSize() > 0) {


            //call the pop method to return letters
            System.out.println(myStack.pop());


        }

    }


}