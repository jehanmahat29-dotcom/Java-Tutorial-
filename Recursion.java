public class Recursion {
    static int factorial(int n) {
        //factorial(n)= n * n-1 * n-2 * ......1
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        if (n==0 || n==1) {
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        else{
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
    public static void main(String[] args) {
        int n = 5;
        System.err.println("The value of n is: " + factorial(n));
        System.out.println(factorial(n));

        int x = 6;
        System.err.println("The value of n is: " + factorial_iterative(x));
        System.out.println(factorial_iterative(x));
    }
}