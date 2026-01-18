public class Fibonacci {
    // Recursive method to compute the nth Fibonacci number
    public static int fibonacci(int n) {
        System.out.println("call fibonacci(" + n + ")");

        if (n == 0) {
            System.out.println("returns 0");
            return 0;
        }
        else if (n == 1) {
            System.out.println("returns 1");
            return 1;
        }
        else {
            int a = fibonacci(n - 1);
            int b = fibonacci(n - 2);
            int result = a + b;
            System.out.println("fibonacci(" + n + ") = fibonacci(" + (n - 1) + ") + fibonacci(" + (n - 2) + 
                               ") is " + a + " + " + b + " = " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.println("Computing fibonacci(" + n + ") = " + result);
    }
}
