package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class MinMaxAbsoulteValues {
    public static void main(String[] args) {
        int[] nums = {100,3,1,10,15,100};
        /** Max and Min of |A[i] - A[j]| **/
        int maxDistance = findMaxDistance(nums);
        System.out.println("Maximum Distance: "+ maxDistance);
        int minDistance = findMinDistance(nums);
        System.out.println("Minimum Distance: "+ minDistance);
    }

    /** Brute Force **/
//    private static int findMinDistance(int[] nums) {
//        int minDistance = Integer.MAX_VALUE;
//        for(int i=0;i<nums.length;i++) {
//            int referencePoint = nums[i];
//            for(int j=i+1;j<nums.length;j++) {
//                int pickedPoint = nums[j];
//                minDistance = Math.min(minDistance, Math.abs(referencePoint - pickedPoint));
//            }
//        }
//        return minDistance;
//    }

    /** The problem is we are not sure whether referencePoint is big or pickedPoint,
     * so we have to use Math.abs, also this is O(n^2).
     * Arrange all these numbers on a number line (sort it). Now you just have to compare the gaps.
     * O(NlogN)
     */

    private static int findMinDistance(int[] nums) {
        int minDistance = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int N = nums.length;
        for(int i=0;i<N-1;i++) {
            minDistance = Math.min(minDistance, nums[i+1] - nums[i]);
        }
        return minDistance;
    }


    private static int findMaxDistance(int[] nums) {
        int fMax = Integer.MIN_VALUE;
        int fMin = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > fMax) {
                fMax = nums[i];
            }
            if(nums[i] < fMin) {
                fMin = nums[i];
            }
        }
        return fMax - fMin;
    }
}
