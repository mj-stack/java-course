
import java.util.Scanner;

public class PalindromeChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Palindrome Checker \n");
    System.out.print("Enter the text to check palindrome: ");
    String myString = input.next();
    System.out.println("Your string is " + (isPalindrome(myString) ? "Palindrome" : "not Palindrome"));
  }

  public static boolean isPalindrome(String str) {
    if (str.length() <= 1) {
      return true;
    }
    int lastPos = str.length() - 1;
    if (str.charAt(0) != str.charAt(lastPos)) {
      return false;
    }
    String newStr = str.substring(1, lastPos);
    return isPalindrome(newStr);
  }
}
