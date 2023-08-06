package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class ManhattanDistance {
    public static void main(String[] args) {
        int[] X = {1,2,6,10,3,6};
        int[] Y = {10,12,8,5,9,100};
        int sumOfManhattanDistance = computeManhattanSum(X, Y);
        System.out.println(sumOfManhattanDistance);
    }

    /** Brute Force O(N^2) **/
//    private static int computeManhattanSum(int[] X, int[] Y) {
//        int N = X.length; // or Y.length
//        int sumOfManhattanDistance = 0;
//        for(int i=0;i<N;i++) {
//            for(int j=i+1;j<N;j++) {
//                sumOfManhattanDistance += Math.abs(X[j]-X[i]) + Math.abs(Y[j]-Y[i]);
//            }
//        }
//        return sumOfManhattanDistance;
//    }

    /** Optimized O(nlogn) **/
    private static int computeManhattanSum(int[] X, int[] Y) {
        return computeComponentSum(X) + computeComponentSum(Y);
    }

    private static int computeComponentSum(int[] nums) {
        int N = nums.length;
        Arrays.sort(nums);
        int totalSum = 0;
        for(int i=0;i<N;i++) {
            totalSum += nums[i];
        }
        int diffSum = 0;
        for(int i=0;i<N;i++) {
            totalSum -= nums[i];
            diffSum += totalSum - (N-1-i) * nums[i];
        }
        return diffSum;
    }
}
