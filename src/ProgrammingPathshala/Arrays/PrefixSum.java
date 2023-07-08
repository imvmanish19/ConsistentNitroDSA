package ProgrammingPathshala.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/** Precomputation Technique **/
public class PrefixSum {
    public static void main(String[] args) {
        int[] prefixSum = computePrefixSum(new int[] {1,2,3,4,5});
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(prefixSum));
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int subarraySum = l == 0 ? prefixSum[r] : prefixSum[r] - prefixSum[l-1];
            System.out.println(subarraySum);
        }
    }

    public static int[] computePrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        return prefixSum;
    }
}
