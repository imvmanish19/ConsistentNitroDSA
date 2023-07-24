package ImpQuestions.SlidingWindow;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {15,3,1,3,4,-2,3,-4};
        int k = 2;
        maximumAverageSubarray(nums, k);
    }

    /** Brute Force O(n*k) **/
//    private static void maximumAverageSubarray(int[] nums, int k) {
//        int n = nums.length;
//        double max = Double.MIN_VALUE;
//        for(int i=0;i<=n-k;i++) {
//            int sum = 0;
//            for(int j=i;j<i+k;j++) {
//                sum+=nums[j];
//            }
//            double avg = (double) sum/k;
//            max = Math.max(avg, max);
//            System.out.print((double) sum/k + " ");
//        }
//        System.out.println("Max: "+max);
//    }

    /** Optimized using Sliding Window (while loop)**/
//    private static void maximumAverageSubarray(int[] nums, int k) {
//        int start = 0;
//        int end = 0;
//        int sum = 0;
//        double max = Double.MIN_VALUE;
//        while(end < nums.length) {
//            if(end-start+1 <= k) {
//                sum += nums[end];
//                end++;
//            } else {
//                max = Math.max(max, (double) sum / k);
//                sum += nums[end];
//                sum -= nums[start];
//                start++;
//                end++;
//            }
//        }
//        System.out.println("Max: "+max);
//    }

    /** Clear and concise for loop Sliding Window **/
    private static void maximumAverageSubarray(int[] nums, int k) {
        int start = 0;
        int sum = 0;
        double max = Double.MIN_VALUE;
        for(int end=0;end<nums.length;end++) {
            sum += nums[end];
            if(end-start+1 == k) {
                double avg = (double) sum / k;
                max = Math.max(max, avg);
                sum -= nums[start];
            }
        }
        System.out.println("Max: "+max);
    }

}
