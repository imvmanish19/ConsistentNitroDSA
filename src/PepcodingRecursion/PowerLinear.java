package PepcodingRecursion;


public class PowerLinear {
    public static void main(String[] args) {
        int ans = power(5, 3);
        System.out.println(ans);
    }

    private static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }
}
