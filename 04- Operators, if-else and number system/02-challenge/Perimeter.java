
import java.util.Scanner;

public class Perimeter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    int length = input.nextInt();
    System.out.print("Enter the width of the rectangle: ");
    int width = input.nextInt();

    int perimeter = (2*(length+width));
    System.out.println("Perimeter of triangle is: "+ perimeter + "sq units");
  }
}
