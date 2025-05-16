
import java.util.Scanner;

public class CircleAreaAndCircumference {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Area and Circumference calculator \n");
    System.out.print("Enter the radius of the circle to find out the area and circumference: ");
    int radius = input.nextInt();
    double area = area(radius);
    System.out.println("Area is " + area);
    double circumference = circumference(radius);
    System.out.println("Circumference is " + circumference);
  }

  public static double area(int r) {
    return ((int) (Math.PI * (Math.pow(r, 2))));
  }

  public static double circumference(int r) {
    return ((int) (2 * Math.PI * r));
  }
}
