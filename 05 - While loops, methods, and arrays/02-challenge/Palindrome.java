public class Palindrome {
  public static void main(String[] args) {
    System.out.println("Welcome to palindrome checked \n");
    int[] myArray = ArrayUtility.inputArray();
    boolean isPalindrome = isPalindrome(myArray);
    if (isPalindrome) {
      System.out.println("Your array is palindrome");
    } else {
      System.out.println("Your array is not palindrome");
    }
  }

  public static boolean isPalindrome(int[] myArray) {
    int i = 0;
    while (i <  (myArray.length / 2)) {
      if (myArray[i] == myArray[myArray.length - 1]) {
        return true;
      }
      i++;
    }
    return false;
  }
}
