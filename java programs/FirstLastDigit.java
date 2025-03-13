import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int lastDigit = 76543 % 10; // Get the last digit
        int firstDigit = 23456;
        
        while (firstDigit >= 10) { // Loop until we get the first digit
            firstDigit /= 10;
        }
        
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
