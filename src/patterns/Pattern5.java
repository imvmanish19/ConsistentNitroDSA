package patterns;

import recursion.basics.InputTaker;

public class Pattern5 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
