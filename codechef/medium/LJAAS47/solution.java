import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Capital 'S' for Scanner
        String name = scanner.nextLine(); // Read the input string
        System.out.println(name.charAt(7)); // Use charAt() to access the character at index 7
    }
}