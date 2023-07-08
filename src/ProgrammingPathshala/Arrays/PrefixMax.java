package ProgrammingPathshala.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixMax {
    public static void main(String[] args) {
        int[] prefixMax = computePrefixMax(new int[] {10,2,30,4,150});
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(prefixMax));
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++) {
            int idx = sc.nextInt();
            int subarrayMax = prefixMax[idx];
            System.out.println(subarrayMax);
        }
    }

    private static int[] computePrefixMax(int[] nums) {
        int[] prefixMax = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            max = Math.max(max, nums[i]);
            prefixMax[i] = max;
        }
        return prefixMax;
    }
}
