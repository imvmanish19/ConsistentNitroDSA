package ProgrammingPathshala.Maths;

public class LCM {
    public static void main(String[] args) {
        int lcm = computeLCMList(40, 42, 45);
        System.out.println(lcm);
    }

    /** Brute Force - O(A*B) **/
//    private static int computeLCM(int a, int b) {
//        int i = 0;
//        for(i = Math.max(a, b);i <= a * b; i++) {
//            if(i % a == 0 && i % b == 0) {
//                break;
//            }
//        }
//        return i;
//    }

    public static int computeLCM(int a, int b) {
        int gcd = computeGCD(a,b);
        return a * b / gcd;
    }

    private static int computeLCMList(int ...nums) {
        int lcm = computeLCM(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++) {
            lcm = computeLCM(lcm, nums[i]);
        }
        return lcm;
    }

    private static int computeGCD(int a, int b) {
        int minm = Math.min(a, b);
        int maxm = Math.max(a, b);
        if(minm == 0) {
            return maxm;
        }
        while(minm != 0) {
            int rem = maxm % minm;
            maxm = minm;
            minm = rem;
        }
        return maxm;
    }
}
