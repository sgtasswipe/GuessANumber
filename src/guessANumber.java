import java.util.Random;
import java.util.Scanner;

public class guessANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int targetNumber;
        int userGuess;
        int score = 3;
        Boolean even;
        System.out.println("Welcome to guess a number!");
        System.out.println("You only have 3 lives to guess the number");
        System.out.println("Guess a number between 1 and 10");

        targetNumber = random.nextInt(10) + 1;


        while (score >0) {    //maximum of 3 guesses. The program will stop after 3 incorrect guesses

            userGuess = in.nextInt();
            in.nextLine(); //scanner bug
            if (userGuess < targetNumber) {
                System.out.println("Higher!");
                score--;                        // -- subtracts 1 from the score
                System.out.println("Lives left: " + score);
            } else if (userGuess > targetNumber) {
                System.out.println("Lower!");
                score--;
                System.out.println("Lives left: " + score);
            } else {
                System.out.println("You've guessed the number!");

                break;

            }
            if (score == 0) {   //if the player reaches a score of 0, the program will end.
                System.out.println("You've run out of guesses! Better luck next time :)");
                System.out.println("The correct number is: " + targetNumber);
            }
            if (score == 1) {  // on the last guess players will get a hint
                if (targetNumber % 2 == 0) {  // means the number is even

                    System.out.println("Hint: The number is even");
                } else {
                    System.out.println("Hint: The number is odd");  // if not even, must be odd
                }
            }
        }

    }


}


