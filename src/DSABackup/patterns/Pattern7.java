package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern7 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
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
}
