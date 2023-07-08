package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern12 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int spaces = 2 * n - 2; // 2(n-1) also same
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            spaces-=2;
            System.out.println();
        }

    }

}
