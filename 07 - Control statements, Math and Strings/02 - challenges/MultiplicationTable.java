
import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to tabel generator \n");
    System.out.print("Enter your desired number to see the table till 10: ");
    int num = input.nextInt();
    generateTable(num);
  }

  public static void generateTable(int num) {
    for (int i = 1; i <= 10; i++) {
      int product = num * i;
      System.out.println(num + " * " + i + " = " + product);
    }
  }
}
