public class PerfectNumbers {
    public static void main(String[] args) {
        int num = 1;
        
        System.out.println("Perfect numbers between 1 and 100:");
        
        while (num <= 100) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
            num++;
        }
    }
    
    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;
        int i = 1;
        
        while (i < number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        
        return sum == number;
    }
}
