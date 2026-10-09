import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static int reguess(Scanner in) {
        System.out.println("Guess again: ");
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);
        return guess;
    }

    public static boolean correct(int guess, int number) {
        if (guess == number) {
            System.out.println("You are correct!");
            return true;
        } else if (guess > number) {
            System.out.println("Your guess is too high");
        } else {
            System.out.println("Your guess is too low");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("I'm thinking of a number between 1 and 100");
        System.out.println(" (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        if (correct(guess, number)) {
            System.out.println("Congratulations!");
        } else {
            guess = reguess(in);
            if (correct(guess, number)) {
                System.out.println("Congratulations!");
            } else {
                guess = reguess(in);
                if (correct(guess, number)) {
                    System.out.println("Congratulations!");
                } else {
                    System.out.println("That's too many incorrect guesses, sorry.");
                    System.out.println("The number I was thinking of is: " + number);
                    int difference = Math.abs(number - guess);
                    System.out.println("You were off by: " + difference);
                    System.out.println("Better luck next time!");
                }
            }
        }
    }
}

