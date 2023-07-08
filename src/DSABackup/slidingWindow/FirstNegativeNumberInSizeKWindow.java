package DSABackup.slidingWindow;

import DSABackup.recursion.basics.InputTaker;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInSizeKWindow {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = InputTaker.inputInt();
        System.out.println(Arrays.toString(firstNegativeNumber(arr, k)));
    }

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
