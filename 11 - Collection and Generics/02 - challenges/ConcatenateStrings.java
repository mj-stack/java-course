public class ConcatenateStrings {
    public static void main(String[] args) {
        concatenate("My ", "name ", "is ", "Mukul ", "Joshi!");
    }

    public static void concatenate(String...str) {
        String concatenatedStr = "";
        for (String s : str) {
            concatenatedStr += s;
        }

        System.out.print(concatenatedStr);
    }
}
