package patterns;

import recursion.basics.InputTaker;

public class Pattern17 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++) {
            char ch = 'A';
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++) {
                System.out.print(ch);
                ch = (char) (((j+1) >= (i+1)) ? ch - 1 : ch + 1);
            }
            System.out.println();
        }
    }
}
