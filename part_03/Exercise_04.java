package part_03;


import java.util.Scanner;

/**
 * Code a "Rock Paper Scissors" Game
 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();

        //create int variable "computerHand" that generates a random number 0-2
        int computerHand = 0 + (int) (Math.random() * ((2 - 0) + 1));

        //call the getHand method for the playerHand
        String playerhandName = getHand(playerHand);
        System.out.println("Player hand:" + playerhandName);

        //call the getHand method for the computerHand
        String computerhandName = getHand(computerHand);
        System.out.println("Computer hand: " + computerhandName);


        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand

        String winner = determineWinner(computerHand, playerHand);
        System.out.println(winner);

        //print out the player hand and computer hand
        System.out.println("Player hand:" + playerhandName);
        System.out.println("Computer hand: " + computerhandName);

        //print out the winner
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand) {

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper


        //this is a temporary return statement to squash error - you'll need to update
        String handName = "";

        switch (hand) {
            case 0:
                handName = "scissor";
                break;
            case 1:
                handName = "rock";
                break;
            case 2:
                handName = "paper";
                break;
        }

        return handName;
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computerHand, int playerHand) {

        String status = "Idle";

        // determine if the game is a tie

        if (computerHand == playerHand)
            return "it's a tie";

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner

        switch (playerHand) {

            case 0:
                status = (computerHand == 1) ? "Computer wins" : "Player wins";
                break;
            case 1:
                status = (computerHand == 2) ? "Computer wins" : "Player wins";
                break;
            case 2:
                status = (computerHand == 0) ? "Computer wins" : "Player wins";
                break;
        }

        return status;

    }
}





