import java.util.Scanner;

public class WelcomeMessage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = input.nextLine();
    System.out.println("Welcome "+name+" to KG Coding!");
  }  
}
