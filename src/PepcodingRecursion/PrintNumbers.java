package PepcodingRecursion;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Decreasing...");
        printDecreasing(5);
        System.out.println("Increasing...");
        printIncreasing(5);
    }

    private static void printDecreasing(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    private static void printIncreasing(int n) {
        if(n == 0) {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
