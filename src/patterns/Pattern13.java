package patterns;

import recursion.basics.InputTaker;

public class Pattern13 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int count = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
