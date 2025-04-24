
import java.util.Scanner;

public class CompoundInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Compound interest");
    System.out.print("Enter P: ");
    int p = input.nextInt();
    System.out.print("Enter T: ");
    int t = input.nextInt();
    System.out.print("Enter R: ");
    int r = input.nextInt();

    int compoundInterest = (p * (1 + (r/100)) * t);
    System.out.println("Compound interest: "+compoundInterest);
  }  
}
