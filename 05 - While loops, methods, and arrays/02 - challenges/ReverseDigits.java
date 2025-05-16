import java.util.Scanner;

public class ReverseDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = scanner.nextInt();
    int reversedNum = reverseNum(num);
    System.out.println("Your reversed number is: " + reversedNum);
  }

  public static int reverseNum(int num) {
    int rNum = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      rNum = (rNum * 10) + lastDigit;
      num /= 10;
    }
    return rNum;
  }
}