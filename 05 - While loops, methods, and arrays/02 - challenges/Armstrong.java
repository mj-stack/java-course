
import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    boolean isArmstrong = isArmstrong(num);
    if(isArmstrong) {
      System.out.println("Your number is Armstong");
    } else {
      System.out.println("Your number is not Armstrong");
    }
  }

  public static boolean isArmstrong(int num) {
    int noOfDigits = numOfDigits(num);
    int numCopy = num;
    int finalNumber = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      num /= 10;
      finalNumber += pow(lastDigit, noOfDigits);
    }

    return finalNumber == numCopy;
  }

  public static int pow(int num1, int num2) {
    int result = 1;
    int i = 0;
    while (i < num2) {
      result *= num1;
      i++;
    }
    return result;
  }

  public static int numOfDigits(int num) {
    int digits = 0;
    while (num > 0) {
      digits++;
      num /= 10;
    }

    return digits;
  }
}