
import java.util.Scanner;

public class Product {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    float num1 = input.nextFloat();
    System.out.print("Enter decond number: ");
    float num2 = input.nextFloat();

    float product = num1 * num2;
    System.out.println("Product is: "+ product);
  }
}
