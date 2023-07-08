package DSABackup.patterns;

import DSABackup.recursion.basics.InputTaker;

public class Pattern21 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++) {
           for(int j=1;j<=n;j++) {
               if(i==1 || i == n || j==1 || j==n) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
    }
}
