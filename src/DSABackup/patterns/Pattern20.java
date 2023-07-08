package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern20 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int spaces = 2 * n;
        for(int i=1;i<=2*n-1;i++) {
            int stars = (i <= n) ? i : (2*n-i);
            spaces = (i <= n) ? spaces-2 : spaces+2;
            for(int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
