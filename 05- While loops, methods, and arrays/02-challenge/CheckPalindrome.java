
import java.util.Scanner;

public class CheckPalindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number to check palindrome: ");
    int num = input.nextInt();
    boolean isPalindrome = isPalindrome(num);
    if (isPalindrome) {
      System.out.println("Your number is palindrome");
    } else {
      System.out.println("Your number is not palindrome");
    }
  }

  public static boolean isPalindrome(int num) {
    int rNum = 0;
    int numCopy = num;
    while (num > 0) {
      int lastDigit = num % 10;
      rNum = (rNum * 10) + lastDigit; 
      num /= 10;
    }
    return rNum == numCopy;
  }
}
