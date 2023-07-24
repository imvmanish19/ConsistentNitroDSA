package ImpQuestions.SlidingWindow;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] nums = {15,3,1,3,400,-2,3,-4};
        int k = 3;
        maximumSumSubarray(nums, k);
    }

    private static void maximumSumSubarray(int[] nums, int k) {
        int start = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int end=0;end<nums.length;end++) {
            sum+=nums[end];
            if(end-start+1 == k) {
                /* Calculation **/
                max = Math.max(max, sum);
                /* Now Prepare for Next Window **/
                sum -= nums[start];
                start++;
            }
        }
        System.out.println("Max: "+max);
    }
}
