public class SumOfPrimes {
    public static void main(String[] args) {
        int num = 2; // Start from the first prime number
        int sum = 0;
        
        while (num <= 100) {
            if (isPrime(num)) {
                sum += num;
            }
            num++;
        }
        
        System.out.println("Sum of prime numbers between 1 and 100: " + sum);
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}