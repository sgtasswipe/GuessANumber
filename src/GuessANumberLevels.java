import java.util.Random;
import java.util.Scanner;

public class GuessANumberLevels {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            Random random = new Random();
            int targetNumber;
            int userGuess;
            int score = 0;
            int numberRange = 1;
            int difficultyLevel;
            int difficultyLevelEasy = 10;
            int difficultyLevelMedium = 20;
            int difficultyLevelHard = 30;
            System.out.println("Welcome to the Guess a Number game! You have 3 lives!");
            System.out.println("Choose your difficulty level");
            System.out.println("1: EASY. 2: MEDIUM. 3: HARD");
            difficultyLevel = in.nextInt();

            switch (difficultyLevel){
                case 1: targetNumber = random.nextInt(difficultyLevelEasy) +1;
                    numberRange = 10;
                    break;
                case 2: targetNumber = random.nextInt(difficultyLevelMedium) +1;
                    numberRange = 20;
                    break;
                case 3: targetNumber = random.nextInt(difficultyLevelHard) +1;
                    numberRange = 30;
                    break;
                default:
                    System.out.println("This is not an option, easy was chosen for you");
                    targetNumber = random.nextInt(difficultyLevelEasy) +1;
                    break;
            }

            int hint = targetNumber % 2;


            while (score < 3) {
                System.out.println("Guess a number between 1 and " +numberRange +": ");
                userGuess = in.nextInt();
                in.nextLine(); // Workaround for a scanner bug

                if (userGuess < targetNumber) {
                    System.out.println("Higher!");
                    score++;
                } else if (userGuess > targetNumber) {
                    System.out.println("Lower!");
                    score++;
                } else {
                    System.out.println("Congratulations! You've guessed the number!");
                    break;
                }

                if (score == 1) {
                    System.out.println("You have used " + score + " life.");
                } else if (score == 2) {
                    System.out.println("You have used " + score + " lives.");
                    if(hint == 0){
                        System.out.println("The number is even");
                    } else{
                        System.out.println("The number is odd");
                    }
                } else if (score == 3) {
                    System.out.println("You have used all your lives. The correct number was " + targetNumber + ".");
                }
            }
        }
    }



