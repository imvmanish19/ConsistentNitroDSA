package recursion.basics;

public class ZigZagPattern {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        zigzag(x);
    }

    private static void zigzag(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Pre: "+n);
        zigzag(n-1);
        System.out.println("In: "+n);
        zigzag(n-1);
        System.out.println("Post: "+n);
    }


}
