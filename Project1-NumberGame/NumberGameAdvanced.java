import java.util.Random;
import java.util.Scanner;

public class NumberGameAdvanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("=== Welcome to Advanced Number Guessing Game ===");

        while (playAgain) {

            int maxRange;

            System.out.println("Choose Difficulty Level:");
            System.out.println("1. Easy (1-50)");
            System.out.println("2. Medium (1-100)");
            System.out.println("3. Hard (1-500)");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                maxRange = 50;
            } else if (choice == 2) {
                maxRange = 100;
            } else {
                maxRange = 500;
            }

            int secretNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between 1 and " + maxRange);

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.next();
                    continue;
                }

                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess > secretNumber) {
                    System.out.println("Too high!");
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    guessedCorrectly = true;
                    break;
                }
            }

            if (guessedCorrectly) {
                int score = (maxAttempts - attempts + 1) * 10;
                System.out.println("Congratulations! You guessed correctly.");
                System.out.println("Attempts used: " + attempts);
                System.out.println("Your score: " + score);

                if (attempts <= 3) {
                    System.out.println("Excellent performance!");
                } else if (attempts <= 6) {
                    System.out.println("Good job!");
                } else {
                    System.out.println("You can improve further!");
                }

            } else {
                System.out.println("Game Over! You've used all attempts.");
                System.out.println("The correct number was: " + secretNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next();

            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        sc.close();
    }
}