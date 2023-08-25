package ProgrammingPathshala.Maths;

public class GCD {
    public static void main(String[] args) {
        int gcd = computeGCD(6, 16);
        int gcdOfLotOfNumbers = computeGCDOfList(12,18,16);
        System.out.println(gcdOfLotOfNumbers);
    }

    /** Brute Force - O(min(A,B)) **/
//    private static int computeGCD(int a, int b) {
//        int gcd = Math.max(a, b); // To handle case of gcd(0,x) = x
//        for(int i=1;i<=Math.min(a,b);i++) {
//            if(a % i == 0 && b % i == 0) {
//                gcd = i;
//            }
//        }
//        return gcd;
//    }

    /** Optimal Solution (Euclid's Division Method) - O(log2(max(a,b))) **/
//    private static int computeGCD(int a, int b) {
//        int minm = Math.min(a, b);
//        int maxm = Math.max(a, b);
//        if(minm == 0) {
//            return maxm;
//        }
//        while(minm != 0) {
//            int rem = maxm % minm;
//            maxm = minm;
//            minm = rem;
//        }
//        return maxm;
//    }

    /** Optimal Solution (Euclid's Subtraction Method) - O(N) (19,1) -> 18,17,16..... So O(N) **/
    private static int computeGCD(int a, int b) {
        if(a == 0 || b == 0) {
            return Math.max(a,b);
        }
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /** GCD of lot of numbers **/
    private static int computeGCDOfList(int ...nums) {
        int gcd = 0;
        for(int i=0;i<nums.length;i++) {
            gcd = computeGCD(gcd, nums[i]);
        }
        return gcd;
    }
}
