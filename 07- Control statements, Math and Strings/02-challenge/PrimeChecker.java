
import java.util.Scanner;

public class PrimeChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to prime number checker \n");
    System.out.print("Enter your number to check if its prime or not: ");
    int num = input.nextInt();
    PrimeChecker primeChecker = new PrimeChecker();
    primeChecker.primeChecker(num);
  }

  public void primeChecker(int num) {
    int factors = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        factors++;
      }
    }
    if (factors <= 2) {
      System.out.println(num + " is a prime number");
    } else {
      System.out.println(num + " is not a prime number");
    }
  }
}
