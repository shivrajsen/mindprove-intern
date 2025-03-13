import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int count = 0;
        int temp = Math.abs(num); // Handle negative numbers
        
        if (temp == 0) { // Special case for 0
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;
            }
        }

        System.out.println("The number of digits in " + num + " is: " + count);
    }
}