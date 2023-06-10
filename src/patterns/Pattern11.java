package patterns;

import recursion.basics.InputTaker;

public class Pattern11 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int start = 1;
        for(int i=1;i<=n;i++) {
            start = i % 2 == 0 ? 0 : 1;
            for(int j=0;j<i;j++) {
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

}
