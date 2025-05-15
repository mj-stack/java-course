
import java.util.Scanner;

public class PasswordChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcomt to password management app \n");
    System.out.print("Enter your password to register yourself: ");
    int password = input.nextInt();
    checkPasword(password);
  }

  public static void checkPasword(int password) {
    Scanner input = new Scanner(System.in);
    int confirmPassword;
    do {
      System.out.print("Confirm your password to login: ");
      confirmPassword = input.nextInt();
    } while (password != confirmPassword);
    System.out.println("Password correct, you are logged in");
  }
}
