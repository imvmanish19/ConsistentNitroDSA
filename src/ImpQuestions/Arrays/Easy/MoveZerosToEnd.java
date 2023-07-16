package ImpQuestions.Arrays.Easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 4, 3, 0, 5, 6};
        System.out.println(Arrays.toString(nums));
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    /** Extra space **/
//    private static void moveZerosToEnd(int[] nums) {
//        int[] newNums = new int[nums.length];
//        int j = 0;
//        for(int i=0;i<nums.length;i++) {
//            if(nums[i] != 0) {
//                newNums[j++] = nums[i];
//            }
//        }
//        /** In java no need of this **/
//         while(j < newNums.length) {
//              newNums[j++] = 0;
//          }
//        for(int i=0;i<nums.length;i++) {
//            nums[i] = newNums[i];
//        }
//    }

//    private static void moveZerosToEnd(int[] nums) {
//        int j = 0;
//        for(int i=0;i<nums.length;i++) {
//            if(nums[i] != 0) {
//                nums[j++] = nums[i];
//            }
//        }
//        while(j < nums.length) {
//            nums[j++] =  0;
//        }
//    }

    private static void moveZerosToEnd(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                swap(nums, i ,j);
                j++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
