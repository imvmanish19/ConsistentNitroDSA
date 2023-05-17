package recursion.basics;

public class PowerLinear {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        int n = InputTaker.inputInt();
        System.out.println(powerLinear(x, n));
    }

    private static int powerLinear(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * powerLinear(x, n-1);
    }
}
