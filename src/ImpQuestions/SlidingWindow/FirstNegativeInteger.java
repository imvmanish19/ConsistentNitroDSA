package ImpQuestions.SlidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-6,0,-13,3,400,2,3,-4};
        int k = 3;
        int[] negatives = firstNegativeInteger(nums, k);
        System.out.println(Arrays.toString(negatives));
    }

    private static int[] firstNegativeInteger(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int start = 0;
        int[] negatives = new int[nums.length-k+1];
        int idx = 0;
        for(int end=0;end<nums.length;end++) {
            if(nums[end] < 0) {
                queue.add(nums[end]);
            }
            if(end-start+1 == k) {
                if(!queue.isEmpty()) {
                    negatives[idx++] = queue.peek();
                } else {
                    idx++;
                }
                if(!queue.isEmpty() && queue.peek() == nums[start]) {
                    queue.remove();
                }
                start++;
            }
        }
        return negatives;
    }

    /** same in d\f way **/
    private static int[] firstNegativeNumber(int[] arr, int k) {
        int[] negativeNumbers = new int[arr.length - k + 1];
        Queue<Integer> nums = new LinkedList<>();
        int start = 0;
        int index = 0;
        for(int end=0;end<arr.length;end++) {
            if(arr[end] < 0) {
                nums.add(arr[end]);
            }
            if(end - start + 1 == k) {
                if(nums.size() == 0) {
                    negativeNumbers[index++] = 0;
                } else {
                    negativeNumbers[index++] = nums.peek();
                }
                if(nums.size() >= 1 && nums.peek() == arr[start]) {
                    nums.remove();
                }
                start++;
            }
        }
        return negativeNumbers;
    }
}
