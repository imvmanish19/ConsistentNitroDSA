package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern16 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print((char) (65+i-1) + " ");
            }
            System.out.println();
        }
    }
}
