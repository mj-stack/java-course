
import java.util.Scanner;

public class ScoreChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to score checker: \n");
    System.out.print("Enter the score in number to check the status: ");
    int score = input.nextInt();
    checkScore(score);
  }

  public static void checkScore(int score) {
    String status = (score > 80) ? "High" : ((score < 50 ? "Low" : "Moderate"));
    System.out.println("Score is " + status);
  }
}
