package ProgrammingPathshala.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubarray {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,12};
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] left = new int[Q];
        int[] right = new int[Q];
        for(int i=0;i<Q;i++) {
            System.out.println("Enter pair (i,j)");
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        int[] sums = new int[Q];
        sumOfSubArray(sums, left, right, nums);
        System.out.println(Arrays.toString(sums));
    }

    /** Brute Force **/
    private static void sumOfSubArray(int[] sums, int[] left, int[] right, int nums[]) {
        for(int i=0;i<sums.length;i++) {
            int sum = 0;
            if(left[i] < 0 || right[i] >= nums.length) {
                sums[i] = -1;
                continue;
            }
            for(int j=left[i];j<=right[i];j++) {
                sum+=nums[j];
            }
            sums[i] = sum;
        }
    }
}
