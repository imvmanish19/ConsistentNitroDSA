package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class PermutationsGenerator {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int N = nums.length;
        /* To avoid the same number again we do fact(N) - 1 **/
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<fact(N)-1;i++) {
            nextPermutation(nums);
            System.out.println(Arrays.toString(nums));
        }
    }

    public static int fact(int N) {
        if(N == 0) {
            return 1;
        }
        return N * fact(N-1);
    }
    public static void nextPermutation(int[] nums) {
        int N = nums.length;
        int i = 0;
        for(i=N-1;i>0;i--) {
            if(nums[i] > nums[i-1]) {
                break;
            }
        }
        if(i - 1 == -1) {
            reverse(nums, i, N-1);
            return;
        }
        int targetIndex = i - 1;
        int nextMaxIndex = getNextMaxIndex(nums, targetIndex);
        int temp = nums[targetIndex];
        nums[targetIndex] = nums[nextMaxIndex];
        nums[nextMaxIndex] = temp;
        reverse(nums, targetIndex + 1, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int getNextMaxIndex(int[] nums, int targetIndex) {
        int targetNum = nums[targetIndex];
        int i = 0;
        for(i=nums.length-1;i>targetIndex;i--) {
            if(nums[i] > targetNum) {
                break;
            }
        }
        return i;
    }
}
