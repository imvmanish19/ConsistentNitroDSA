package ProgrammingPathshala.Arrays;

public class MaximumChunksDescending {
    public static void main(String[] args) {
        /* Descending  3,1,2,0 => [3] [1,2] [0] **/
        /* 5,4,3,2,1,0 => ans = 6 **/
        /* 5,4,2,3,0,1 => ans = 3 **/
        /* Prefix Max of 5,4,2,3,0,1 => 5,4,4,4,4,4 **/
        /* Suffix Max => 5,4,3,3,1,1 */
        int[] nums = {3,1,2,0};
        int ans = breakToChunks(nums);
        System.out.println("Maximum Chunks: "+ans);
    }

    private static int breakToChunksOptimized(int[] nums) {
        int currentMax = Integer.MIN_VALUE;
        int ans = 0;
        int max = nums.length - 1;
        /* Reverse Engineering **/
        for(int i=0;i<nums.length;i++) {
            nums[i] = max - nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            currentMax = Math.max(currentMax, nums[i]);
            if(currentMax == i) {
                ans++;
            }
        }
        return ans;
    }

    /** Brute Force O(N^2) **/
    private static int breakToChunks(int[] nums) {
        int i = 0, ans = 0;
        int j = 0;
        while(i < nums.length) {
            for(j=i;j<nums.length;j++) {
                if(canBeChunked(nums, i, j)) {
                    break;
                }
            }
            i = j + 1;
            ans++;
        }
        return ans;
    }

    private static boolean canBeChunked(int[] nums, int i, int j) {
        int count = 0;
        int N = nums.length;
        for(int k=i;k<=j;k++) {
            // i is small, j is bigger so after subtraction j becomes much lesser
            if(nums[k] >= N-j-1 && nums[k] <= N-i-1) {
                count++;
            }
        }
        return count == j - i + 1;
    }
}
