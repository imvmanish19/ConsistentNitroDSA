package ProgrammingPathshala.Arrays;

public class MinSwapsToBringElementsLessThanKTogether {
    public static void main(String[] args) {
        int[] nums = {2,30,4,7,5,1};
        int k = 5;
        System.out.println(minSwaps(nums, k));
    }

    private static int minSwaps(int[] nums, int k) {
        int windowSize = getCount(nums, k);
        int start = 0;
        int count = 0;
        int minSwaps = Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++) {
            if(nums[end] <= k) {
                count++;
            }
            if(end - start + 1 == windowSize) {
                minSwaps = Math.min(minSwaps, windowSize - count);
                if(nums[start] <= k) {
                    count--;
                }
                start++;
            }
        }
        return minSwaps == Integer.MAX_VALUE ? 0 : minSwaps;
    }

    private static int getCount(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] <= k) {
                count++;
            }
        }
        return count;
    }
}
