import java.util.Scanner;

public class AgeChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();

    if (age > 60) {
      System.out.println("You are a senior");
    } else if (age >= 20 && age <= 60 ) {
      System.out.println("You are an adult");
    } else if (age >= 13 && age < 20) {
      System.out.println("You are a teen");
    } else {
      System.out.println("You are a child");
    }
  }
}
