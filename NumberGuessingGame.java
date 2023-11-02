import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;
            
            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfAttempts + " attempts.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        scanner.close();
    }
}

