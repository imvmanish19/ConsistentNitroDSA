package ProgrammingPathshala.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfSubarray {
    public static void main(String[] args) {
        int[] nums = {5,3,4,7,6,12};
        int[] prefixMax = computePrefixMax(nums);
        System.out.println(Arrays.toString(prefixMax));
        Scanner sc = new Scanner(System.in);
        int Q = 3;
        for(int i=0;i<Q;i++) {
            int idx = sc.nextInt();
            if(idx >= nums.length) {
                System.out.println("Invalid input");
                continue;
            }
            System.out.println(prefixMax[idx]);
        }
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
}
