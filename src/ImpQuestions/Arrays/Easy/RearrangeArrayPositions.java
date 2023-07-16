package ImpQuestions.Arrays.Easy;

import java.util.Arrays;

import static ImpQuestions.Arrays.Easy.MoveZerosToEnd.swap;

public class RearrangeArrayPositions {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 2, 5 };
        int[] ans = rearrange(nums);
        System.out.println(Arrays.toString(ans));
    }

    /** Brute Force **/
//    private static int[] rearrange(int[] nums) {
//        /* Using 1 based indexing **/
//        int[] ans = new int[nums.length];
//        int min = 0;
//        int max = nums.length - 1;
//        Arrays.sort(nums);
//        for(int i=0;i<ans.length;i++) {
//            if((i+1) % 2 == 0) {
//                ans[i] = nums[max--];
//            } else {
//                ans[i] = nums[min++];
//            }
//        }
//        return ans;
//    }

    /** Optimized **/
    private static int[] rearrange(int[] nums) {
        /* Using 1 based indexing **/
        for(int i=1;i<nums.length;i++) {
            if((i+1) % 2 == 0) {
                if(nums[i] < nums[i-1]) {
                    swap(nums, i, i - 1);
                }
            } else {
                if(nums[i] > nums[i-1]) {
                    swap(nums, i, i - 1);
                }
            }
        }
        return nums;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
