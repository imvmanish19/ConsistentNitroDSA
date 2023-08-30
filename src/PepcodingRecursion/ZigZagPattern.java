package PepcodingRecursion;

public class ZigZagPattern {
    public static void main(String[] args) {
        zizzag(3);
    }

    private static void zizzag(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Pre: "+ n);
        zizzag(n-1);
        System.out.println("In: "+ n);
        zizzag(n-1);
        System.out.println("Post: "+ n);
    }
}
