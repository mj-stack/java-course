
import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base of the triangle: ");
    int base = input.nextInt();
    System.out.println("Base is"+ base);
    System.out.print("Enter the height of the triangle: ");
    int height = input.nextInt();
    System.out.println("Height is"+ height);

    int area = ((base*height)/2);
    System.out.println("Area of triangle is: "+ area);
  }
}
