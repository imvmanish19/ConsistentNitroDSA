package recursion.basics;

public class PowerLog {
    public static void main(String[] args) {
        int x = InputTaker.inputInt();
        int n = InputTaker.inputInt();
        System.out.println(powerLog(x, n));
    }

    private static int powerLog(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int powerHalf = powerLog(x, n/2);
        if(n % 2 == 0) {
            return powerHalf * powerHalf;
        }
        return powerHalf * powerHalf * x;
    }
}
