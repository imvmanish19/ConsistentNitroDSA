package randomQuestions;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(findMaxAverage(nums, 2));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            int sum = 0;
            for(int j=0;j<k;j++) {
                if(i+(k-1) <= nums.length - 1) {
                    sum += nums[i+j];
                } else {
                    i = nums.length;
                    j = k;
                }
            }
            double average = (double) sum / k;
            if(average > max) {
                max = average;
            }
        }
        if(max == -Double.MAX_VALUE) {
            return 0;
        }
        return max;
    }
}

/** Optimized **/
/** class Solution {
 public double findMaxAverage(int[] nums, int k) {
 int windowSum = 0;
 int start = 0;
 double max = -Double.MAX_VALUE;
 for(int end=0;end<nums.length;end++) {
 windowSum += nums[end];
 if(end - start + 1 == k) {
 max = Math.max(max, (double) windowSum / k);
 windowSum -= nums[start];
 start++;
 }
 }
 return max;
 }
 }
 **/
