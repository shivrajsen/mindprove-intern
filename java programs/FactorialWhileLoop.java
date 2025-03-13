import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Ask user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        long factorial = 1; // Initialize factorial result
        int i = num; // Start from the number
        
        // While loop to calculate factorial
        while (i > 1) {
            factorial *= i;
            i--;
        }
        
        // Output: Print the factorial
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        scanner.close();
    }
}