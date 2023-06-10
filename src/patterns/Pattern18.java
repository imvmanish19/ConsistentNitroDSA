package patterns;

import recursion.basics.InputTaker;

public class Pattern18 {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        char threshold = 'E';
        for(int i=1;i<=n;i++) {
            char ch = (char) (threshold - i + 1);
            for(int j=1;j<=i;j++) {
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }
    }
}
