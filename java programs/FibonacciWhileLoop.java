public class FibonacciWhileLoop {
    public static void main(String[] args) {
        int n = 100; // Number of terms
        long firstTerm = 0, secondTerm = 1;
        int count = 0;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        while (count < n) {
            System.out.print(firstTerm + " ");
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            count++;
        }
    }
}
