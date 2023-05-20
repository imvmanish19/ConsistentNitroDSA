package recursion.basics;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = InputTaker.inputInt();
        String A = InputTaker.inputString();
        String B = InputTaker.inputString();
        String C = InputTaker.inputString();
        towerOfHanoi(n,A,B,C);
    }

    private static void towerOfHanoi(int n, String A, String B, String C) {
        if(n==0) {
            return;
        }
        towerOfHanoi(n-1, A, C, B);
        System.out.println("Disk "+n+" ["+A+"->"+B+"] ");
        towerOfHanoi(n-1, C, B, A);
    }

}
