public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 2; // Start from the first prime number

        while (num <= 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) { // Check divisibility up to square root of n
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
