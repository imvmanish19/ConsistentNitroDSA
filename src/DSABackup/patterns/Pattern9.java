package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern9 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printUpperPattern(n);
        printLowerPattern(n);
    }

    private static void printUpperPattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=1;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printLowerPattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<(n-i)*2-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
