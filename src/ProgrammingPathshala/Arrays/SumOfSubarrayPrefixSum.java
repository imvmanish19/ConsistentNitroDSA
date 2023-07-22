package ProgrammingPathshala.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubarrayPrefixSum {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,12};
        int[] prefixSum = computePrefixSum(nums);
        System.out.println(Arrays.toString(prefixSum));
        Scanner sc = new Scanner(System.in);
        int Q = 3;
        for(int i=0;i<Q;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l < 0 || r >= nums.length) {
                System.out.println("Input not valid!");
            }
            /** Edge case (l-1) **/
            if(l == 0) {
                System.out.println(prefixSum[r]);
                continue;
            }
            System.out.println(prefixSum[r] - prefixSum[l-1]);
        }
    }

    /** One kind of approach to compute prefix sum **/
//    private static int[] computePrefixSum(int[] nums) {
//        int sum = 0;
//        int[] prefixSum = new int[nums.length];
//        for(int i=0;i<nums.length;i++) {
//            sum += nums[i];
//            prefixSum[i] = sum;
//        }
//        return prefixSum;
//    }

    /** Using prefix sum only to do compute prefix sum **/
    private static int[] computePrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        return prefixSum;
    }
}
