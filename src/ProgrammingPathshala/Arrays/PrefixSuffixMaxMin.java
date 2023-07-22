package ProgrammingPathshala.Arrays;

import java.util.Arrays;

public class PrefixSuffixMaxMin {
    public static void main(String[] args) {
        int[] nums = {-1,-5,0,2,-3,-4};
        System.out.println(Arrays.toString(nums));
        int[] prefixSum = computePrefixSum(nums);
        System.out.println(Arrays.toString(prefixSum));
        int[] suffixSum = computeSuffixSum(nums);
        System.out.println(Arrays.toString(suffixSum));
        int[] prefixMax = computePrefixMax(nums);
        System.out.println(Arrays.toString(prefixMax));
        int[] prefixMin = computePrefixMin(nums);
        System.out.println(Arrays.toString(prefixMin));
        int[] suffixMax = computeSuffixMax(nums);
        System.out.println(Arrays.toString(suffixMax));
        int[] suffixMin = computeSuffixMin(nums);
        System.out.println(Arrays.toString(suffixMin));
    }

    private static int[] computePrefixSum(int[] nums) {
        /** Empty Array Case **/
        if(nums.length == 0) {
            return null;
        }
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        return prefixSum;
    }

    private static int[] computeSuffixSum(int[] nums) {
        /** Empty Array Case **/
        if(nums.length == 0) {
            return null;
        }
        int[] suffixSum = new int[nums.length];
        suffixSum[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--) {
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }
        return suffixSum;
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

    private static int[] computePrefixMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] prefixMin = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            min = Math.min(min, nums[i]);
            prefixMin[i] = min;
        }
        return prefixMin;
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

    private static int[] computeSuffixMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] suffixMin = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) {
            min = Math.min(min, nums[i]);
            suffixMin[i] = min;
        }
        return suffixMin;
    }
}
