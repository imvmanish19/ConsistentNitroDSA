package patterns;

import recursion.basics.InputTaker;

public class SquarePattern {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        printSquarePattern(n);
    }

    private static void printSquarePattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
