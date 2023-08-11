package ProgrammingPathshala.Arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
//        rotateBruteForce(nums, 1);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(reverseTempArray(nums, 3)));
        rotateArray(nums, 4);
        System.out.println(Arrays.toString(nums));
    }

    /** O(n*K) == O(n^2) **/
    private static void rotateBruteForce(int[] nums, int k) {
        int N = nums.length;
        k = k % N;
        for(int j=0;j<k;j++) {
            int temp = nums[N-1];
            for(int i=N-2;i>=0;i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
        }
    }

    /** O(n), O(n) **/
    private static int[] rotateTempArray(int[] nums, int k) {
        int N = nums.length;
        int[] temp = new int[N];
        for(int i=0;i<N;i++) {
            temp[(i+k) % N] = nums[i];
        }
        return temp;
    }

    /** O(n), O(1) **/

    private static void rotateArray(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
