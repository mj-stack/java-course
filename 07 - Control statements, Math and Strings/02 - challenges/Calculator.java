
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to my calculator app \n");
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Now, enter second number 2: ");
    int num2 = input.nextInt();
    System.out.print("Enter operator (+, -, *, /): ");
    String operator = input.next();
    Calculator calculator = new Calculator();
    calculator.calculator(num1, num2, operator);
  }

  public void calculator(int num1, int num2, String operator) {
    int result = switch (operator) {
      case "+" -> (num1 + num2);
      case "-" -> (num1 - num2);
      case "/" -> (num1 / num2);
      case "*" -> (num1 * num2);
      default -> 0;
    };
    System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is " + result);
  }
}
