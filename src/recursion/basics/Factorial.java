package recursion.basics;

public class Factorial {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        System.out.println(factorial(x));
    }

    private static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
