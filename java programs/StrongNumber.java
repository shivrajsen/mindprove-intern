import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += factorial(digit);  // Add factorial of the digit
            num /= 10;  // Remove last digit
        }
        
        // Check if sum of factorials is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is not a Strong number.");
        }
        
        scanner.close();
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
