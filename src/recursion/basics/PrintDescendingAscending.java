package recursion.basics;

public class PrintDescendingAscending {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        printDescendingAscending(x);
    }

    public static void printDescendingAscending(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDescendingAscending(n-1);
        System.out.println(n);
    }
}
