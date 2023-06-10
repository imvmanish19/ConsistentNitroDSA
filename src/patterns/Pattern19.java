package patterns;

import recursion.basics.InputTaker;

public class Pattern19 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printUpperPattern(n);
        printLowerPattern(n);
    }

    private static void printUpperPattern(int n) {
        int spaces = 0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-i+1);j++) {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i+1);j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces+=2;
        }
    }

    private static void printLowerPattern(int n) {
        int spaces = 2 * n -2;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces-=2;
        }
    }
}
