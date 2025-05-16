import java.util.Scanner;

public class TempF2C {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("Temprature converter:");
    System.out.print("Enter the temp in Fahrenheit: ");
    int f = input.nextInt();
    
    int c = (((f-32) * 5) / 9);
    System.out.println("Temp in celcius "+c);
  }
}