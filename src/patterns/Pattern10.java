package patterns;

import recursion.basics.InputTaker;

public class Pattern10 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=2*n-1;i++) {
            int stars = i > n ? 2 * n - i : i;
            for(int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
