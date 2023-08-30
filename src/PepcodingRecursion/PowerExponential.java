package PepcodingRecursion;

public class PowerExponential {
    public static void main(String[] args) {
        int ans = power(2, 10);
        System.out.println(ans);
    }

    private static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int ans = power(x, n/2);
        if(n % 2 == 0) {
            return ans * ans;
        } else {
            return ans * ans * x;
        }
    }
}
