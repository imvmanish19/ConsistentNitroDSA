package DSABackup.recursion.basics;

public class PrintDecreasing {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        printDecreasing(x);
    }

    public static void printDecreasing(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
