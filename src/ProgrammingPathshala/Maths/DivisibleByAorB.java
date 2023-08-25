package ProgrammingPathshala.Maths;

public class DivisibleByAorB {
    public static void main(String[] args) {
        int N = 20;
        int A = 2;
        int B = 3;
        int count = countNumbers(N, A, B);
        System.out.println(count);
    }

    private static int countNumbers(int n, int a, int b) {
        /** Can be extended to more numbers like a,b,c .. **/
        return n/a + n/b - n/LCM.computeLCM(a,b);
    }
}
