package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern22 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=0;i<2*n-1;i++) {
            for(int j=0;j<2*n-1;j++) {
                int top = i;
                int down = (2 * n - 2) - i;
                int left = j;
                int right = (2 * n - 2) - j;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
