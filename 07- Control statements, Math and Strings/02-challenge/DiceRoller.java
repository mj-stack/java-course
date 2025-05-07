public class DiceRoller {
  public static void main(String[] args) {
    System.out.println("Welcome to dice roller game \n");
    int randomNumber = (int) ((Math.random() * 6) + 1);
    System.out.println("Your number is " + randomNumber);
  }
}