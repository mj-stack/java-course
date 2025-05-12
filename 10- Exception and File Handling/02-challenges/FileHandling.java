import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to file reading app \n");
        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        System.out.println(fileName);
        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("%s not found", fileName);
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s", exception.getMessage());
        }
    }
}
