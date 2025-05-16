
import java.util.Scanner;

public class NumberGuessing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to number guessing game \n");
    int computerGuess = (int) ((Math.random() * 10) + 1);
    int userGuess;
    do {
      System.out.print("Enter the number between you think computer has guessed: ");
      userGuess = input.nextInt();
    } while (userGuess != computerGuess);
    System.out.println("Correct, you both guessed right: " + computerGuess);
  }
}
