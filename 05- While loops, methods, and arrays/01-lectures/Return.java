import java.util.Scanner;

public class Return{
  public static void main(String[] args) {
    greet();
    int num1 = readNumber();
    int num2 = readNumber();
    int sum = num1 + num2;
    System.out.println("The sum is " + sum);
  }
  
  public static void greet() {
    System.out.println("Welcome to calculator\n");
  }

  public static int readNumber() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    return input.nextInt();
  }
}