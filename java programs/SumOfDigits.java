import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum number");
        int number = scanner.nextInt();
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10; // Extract the last digit and add to sum
            number /= 10; // Remove the last digit
        }
        
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
