
import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Prime number calculator: ");
    System.out.print("Enter your num: ");
    int num = scanner.nextInt();
    String isPrime = isPrime(num);
    System.out.println(isPrime);
  }

  public static String isPrime(int num) {
    int times = 0;
    int i = 1;
    while (i <= num) {
      if (num%i == 0) {
        times++;
      }
      i++;
    }
    if (times <= 2) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
