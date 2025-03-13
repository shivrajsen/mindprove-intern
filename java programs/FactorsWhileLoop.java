import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Factors of " + number + " are:");
        
        int i = 1; // Initialize counter
        while (i <= number) {
            if (number % i == 0) { // Check if 'i' is a factor
                System.out.print(i + " ");
            }
            i++; // Increment counter
        }
        
        scanner.close();
    }
}
