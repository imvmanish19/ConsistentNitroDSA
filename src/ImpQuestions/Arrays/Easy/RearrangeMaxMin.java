package ImpQuestions.Arrays.Easy;

import java.util.Arrays;

public class RearrangeMaxMin {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] ans = rearrangeMinMax(nums);
        System.out.println(Arrays.toString(ans));
    }

//    private static int[] rearrangeMinMax(int[] nums) {
//        int[] ans = new int[nums.length];
//        int big = nums.length - 1;
//        int small = 0;
//        for(int i=0;i<ans.length;i++) {
//            if(i % 2 == 0) {
//                ans[i] = nums[big--];
//            } else {
//                ans[i] = nums[small++];
//            }
//        }
//        return ans;
//    }

    /* Optimized **/
    private static int[] rearrangeMinMax(int[] nums) {
        int maxElement = nums[nums.length-1] + 1;
        int minIndex = 0;
        int maxIndex = nums.length - 1;
        for(int i=0;i<nums.length;i++) {
            if(i % 2 == 0) {
                nums[i] = nums[i] + nums[maxIndex--] % maxElement * maxElement;
            } else {
                nums[i] = nums[i] + nums[minIndex++] % maxElement * maxElement;
            }
        }

        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i] / maxElement;
        }
        return nums;
    }
}
