package slidingWindow;

import recursion.basics.InputTaker;

public class MaximumAverageSumOfSizeK {
    public static void main(String[] args) {
        int[] arr = {11,2,5};
        int k = InputTaker.inputInt();
        System.out.println(maximumSumAverage(arr, k));
    }

    private static double maximumSumAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for(int end=0;end<nums.length;end++) {
            sum+=nums[end];
            if(end - start + 1 == k) {
                double average = (double) sum/k;
                max = Math.max(max, average);
                sum-=nums[start];
                start++;
            }
        }
        return max;
    }
}
