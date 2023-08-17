import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        int generatedNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;

        Scanner scanner = new Scanner(System.in);

        while (userGuess != generatedNumber) {
            
            System.out.print("Guess the number (between 1 and 100): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Consume the invalid input
                System.out.print("Guess the number (between 1 and 100): ");
            }

            userGuess = scanner.nextInt();

            if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        scanner.close();
    }
}