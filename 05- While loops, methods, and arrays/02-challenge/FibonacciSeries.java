import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = scanner.nextInt();
    printFibonacciSeries(num);
  }

  public static void printFibonacciSeries(int num) {
    if (num < 0) return;
    System.out.println("0 ");
    if (num == 0) return;
    System.out.println("1 ");

    int firstNum = 0;
    int secondNum = 1;
    while (firstNum + secondNum < num) {
      int thirdNum = firstNum + secondNum;
      System.out.println(thirdNum + " ");
      firstNum = secondNum;
      secondNum = thirdNum;
    }
  }
}
