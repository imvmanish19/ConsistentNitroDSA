package ImpQuestions.Arrays.Easy;

import java.util.Arrays;

public class MoveZerosToFront {

    public static void main(String[] args) {
        int[] nums = {30, 0, 0, 4, 3, 0, 5, 6};
        System.out.println(Arrays.toString(nums));
        moveZerosToFront(nums);
        System.out.println(Arrays.toString(nums));
    }
//    private static void moveZerosToFront(int[] nums) {
//        int j = nums.length - 1;
//        for(int i=nums.length-1;i>=0;i--) {
//            if(nums[i] != 0) {
//                nums[j--] = nums[i];
//            }
//        }
//        while(j >= 0) {
//            nums[j--] = 0;
//        }
//    }

    private static void moveZerosToFront(int[] nums) {
        int start = 0;
        int end = 1;
        while(end < nums.length) {
            if(nums[end] == 0) {

            }
        }
    }
}
