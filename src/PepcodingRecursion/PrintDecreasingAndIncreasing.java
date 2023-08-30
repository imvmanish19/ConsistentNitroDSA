package PepcodingRecursion;

public class PrintDecreasingAndIncreasing {
    public static void main(String[] args) {
        printDI(5);
    }

    private static void printDI(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDI(n-1);
        System.out.println(n);
    }
}
