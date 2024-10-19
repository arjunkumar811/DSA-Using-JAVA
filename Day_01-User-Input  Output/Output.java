 import java.util.Scanner; // Import the Scanner class

public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Clear the newline after reading the int
        scanner.nextLine(); 
        
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}
