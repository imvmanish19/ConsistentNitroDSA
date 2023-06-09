package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern8 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
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
