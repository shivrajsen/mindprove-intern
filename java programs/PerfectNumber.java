import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int i = 1; // Start from 1

        // Find the divisors and sum them up
        while (i <= num / 2) { // Divisors are always <= num/2
            if (num % i == 0) {
                sum += i;
            }
            i++; // Increment the loop counter
        }

        // Check if the number is perfect
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}
