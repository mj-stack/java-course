
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcomt to number guessing game /n");
    System.out.println("Try to guess a number between 1-10 and see if you wins");
    int randomNum = (int) (Math.random() * 10 + 1);
    int num;
    do {
      System.out.print("Enter the number: ");
      num = input.nextInt();
    } while (randomNum != num);
    System.out.println("Correct computer has guessed " + randomNum);
  }
}
