import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int product = 1; // Initialize product to 1
        
        // Handling case when input is 0
        if (num == 0) {
            product = 0;
        } else {
            while (num > 0) {
                int digit = num % 10; // Extract last digit
                product *= digit; // Multiply with product
                num /= 10; // Remove last digit
            }
        }
        
        // Output the result
        System.out.println("Product of digits: " + product);
        
        scanner.close();
    }
}
