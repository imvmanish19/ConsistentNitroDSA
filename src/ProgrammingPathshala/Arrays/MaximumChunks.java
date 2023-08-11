package ProgrammingPathshala.Arrays;

public class MaximumChunks {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3};
        int ans = breakToChunksOptimized(nums);
        System.out.println("Maximum Chunks: "+ans);
    }

    private static int breakToChunksOptimized(int[] nums) {
        int currentMax = Integer.MIN_VALUE;
        int ans = 0;
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
        for(int k=i;k<=j;k++) {
            if(nums[k] >= i && nums[k] <= j) {
                count++;
            }
        }
        return count == j - i + 1;
    }
}
