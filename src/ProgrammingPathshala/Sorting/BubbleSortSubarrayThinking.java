package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class BubbleSortSubarrayThinking {
    public static void main(String[] args) {
        int[] arr = {2,3,40,1,1,23,24,90,10};
        bubbleSort(arr);
        System.out.println("Ascending: "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] nums) {
        boolean done = false;
        int i = 0;
        int N = nums.length;
        while(!done) {
            done = true;
            i = 0;
            while(i < N - 1) {
                if(nums[i] > nums[i+1]) {
                    swap(nums, i, i+1);
                    done = false;
                }
                i++;
            }
            if(done) {
                break;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
