package PepcodingRecursion;


public class Factorial {
    public static void main(String[] args) {
        int factorial = fact(10);
        System.out.println(factorial);
    }

    private static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
}
