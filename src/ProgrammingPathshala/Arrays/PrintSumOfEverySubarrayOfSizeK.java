package ProgrammingPathshala.Arrays;

public class PrintSumOfEverySubarrayOfSizeK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        subarraySum(nums, 3);
    }

    private static void subarraySum(int[] nums, int k) {
        int start = 0;
        int sum = 0;
        for(int end=0;end<nums.length;end++) {
            sum += nums[end];
            if(end-start+1 == k) {
                System.out.print(sum + " ");
                sum -= nums[start];
                start++;
            }
        }
    }
}
