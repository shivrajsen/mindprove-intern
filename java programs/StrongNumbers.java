public class StrongNumbers {
    // Method to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        return fact;
    }

    // Method to check if a number is Strong
    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers between 1 and 100:");

        int i = 1;
        while (i <= 100) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
