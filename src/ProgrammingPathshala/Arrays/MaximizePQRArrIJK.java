package ProgrammingPathshala.Arrays;

import java.util.Arrays;

public class MaximizePQRArrIJK {
    public static void main(String[] args) {
        int[] nums = {100,-2,100,99,300};
        int max = maximize(nums, 1, -2, 3);
        System.out.println(max);
    }

    private static int maximize(int[] nums, int p, int q, int r) {
        int max = Integer.MIN_VALUE;
        int[] prefixMax = computePrefixMax(nums);
        int[] suffixMax = computeSuffixMax(nums);
        System.out.println(Arrays.toString(prefixMax));
        System.out.println(Arrays.toString(suffixMax));
        for(int i=1;i<nums.length-1;i++) {
            max = Math.max(max, p * prefixMax[i-1] + q * nums[i] + r * suffixMax[i+1]);
        }
        return max;
    }

    private static int[] computePrefixMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] prefixMax = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            max = Math.max(max, nums[i]);
            prefixMax[i] = max;
        }
        return prefixMax;
    }

    private static int[] computeSuffixMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] suffixMax = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) {
            max = Math.max(max, nums[i]);
            suffixMax[i] = max;
        }
        return suffixMax;
    }
}
