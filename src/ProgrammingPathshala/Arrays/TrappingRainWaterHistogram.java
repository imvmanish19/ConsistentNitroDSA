package ProgrammingPathshala.Arrays;

public class TrappingRainWaterHistogram {
    public static void main(String[] args) {
        int[] height = {0,2,4,3,2,1,0,10};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int[] prefixMax = computePrefixMax(height);
        int[] suffixMax = computeSuffixMax(height);
        int totalWaterContained = 0;
        for(int i=1;i<height.length-1;i++) {
            int minHeight = Math.min(prefixMax[i-1], suffixMax[i+1]);
            if(height[i] < minHeight) {
                totalWaterContained += (minHeight - height[i]);
            }
        }
        return totalWaterContained;
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

    private static int[] computeSuffixMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] suffixMax = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) {
            max = Math.max(max, nums[i]);
            suffixMax[i] = max;
        }
        return suffixMax;
    }
}
