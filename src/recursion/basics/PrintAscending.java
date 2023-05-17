package recursion.basics;

public class PrintAscending {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        printAscending(x);
    }

    public static void printAscending(int n) {
        if(n == 0) {
            return;
        }
        printAscending(n-1);
        System.out.println(n);
    }
}
