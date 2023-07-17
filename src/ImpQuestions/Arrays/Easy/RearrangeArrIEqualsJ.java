package ImpQuestions.Arrays.Easy;

import java.util.Arrays;

public class RearrangeArrIEqualsJ {
    public static void main(String[] args) {
        int[] nums = {2,0,3,1};
        int[] output = rearrange(nums);
        System.out.println(Arrays.toString(output));
    }

//    private static int[] rearrange(int[] nums) {
//        int[] temp = new int[nums.length];
//        for(int i=0;i<nums.length;i++) {
//            temp[nums[i]] = i;
//        }
//        return temp;
//    }

    /** Optimized **/
    private static int[] rearrange(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++) {
            nums[nums[i] % n] += i * n;
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] /= n;
        }
        return nums;
    }
}
