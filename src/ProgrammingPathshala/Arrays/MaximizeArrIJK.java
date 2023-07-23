package ProgrammingPathshala.Arrays;

import java.util.Arrays;

public class MaximizeArrIJK {
    public static void main(String[] args) {
        int[] nums = {100,-2,100,0,33};
        int[] indexes = maximizeAddition(nums);
        System.out.println(Arrays.toString(indexes));
    }

    /** Brute Force **/
//    private static int[] maximizeAddition(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        int[] indexes = new int[3];
//        for(int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length;j++) {
//                for(int k=j+1;k<nums.length;k++) {
//                    int sum = nums[i]+nums[j]+nums[k];
//                    if(sum > max) {
//                        max = Math.max(max, sum);
//                        indexes[0] = i;
//                        indexes[1] = j;
//                        indexes[2] = k;
//                    }
//                }
//            }
//        }
//        System.out.println("Max: "+max);
//        return indexes;
//    }

    /** Optimized **/
    private static int[] maximizeAddition(int[] nums) {
        int[] prefixMax = computePrefixMax(nums);
        int[] suffixMax = computeSuffixMax(nums);
        int max = Integer.MIN_VALUE;
        int[] maxIndexes = new int[3];
        for(int i=1;i<nums.length-1;i++) {
            int sum = prefixMax[i-1] + nums[i] + suffixMax[i+1];
            max = Math.max(max, sum);
        }
        System.out.println("Max: "+max);
        return maxIndexes;
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
