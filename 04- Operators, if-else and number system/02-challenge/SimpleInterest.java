
import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Simple interest");
    System.out.print("Enter P: ");
    int p = input.nextInt();
    System.out.print("Enter T: ");
    int t = input.nextInt();
    System.out.print("Enter R: ");
    int r = input.nextInt();

    int simpleInterest = ((p*r*t)/100); 
    System.out.println("Simple interest is: "+ simpleInterest);
  }
}
