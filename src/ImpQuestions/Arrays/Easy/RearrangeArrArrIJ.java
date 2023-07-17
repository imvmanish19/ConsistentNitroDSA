package ImpQuestions.Arrays.Easy;

import java.util.Arrays;

public class RearrangeArrArrIJ {
    public static void main(String[] args) {
        int[] nums = {3,2,0,1};
        int[] output = rearrange(nums);
        System.out.println(Arrays.toString(output));
    }

//    private static int[] rearrange(int[] nums) {
//        int[] temp = new int[nums.length];
//        for(int i=0;i<nums.length;i++) {
//            temp[i] = nums[nums[i]];
//        }
//        return temp;
//    }

    /** Optimized **/
    private static int[] rearrange(int[] nums) {
        int n = nums.length;
        /** nums[nums[i]<-- this can give array out of bounds, so have check %n] **/
        for(int i=0;i<nums.length;i++) {
            nums[i] += nums[nums[i]] % n * n;
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] /= n;
        }
        return nums;
    }
}
