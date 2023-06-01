package slidingWindow;

import recursion.basics.InputTaker;

public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int k = InputTaker.inputInt();
        System.out.println(maximumSum(arr, k));
    }

    private static int maximumSum(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        for(int end=0;end<nums.length;end++) {
            sum+=nums[end];
            if(end - start + 1 == k) {
                max = Integer.max(max, sum);
                sum-=nums[start];
                start++;
            }
        }
        return max;
    }
}
