package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class BubbleSortAvoidUnnecessaryIterations {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5};
        bubbleSort(arr);
        System.out.println("Ascending: "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] nums) {
        int N = nums.length;
        for(int i=0;i<N-1;i++) {
            boolean done = bubble(nums, 0, N-i-1);
            if(done) {
                break;
            }
        }
    }

    private static boolean bubble(int[] nums, int i, int j) {
        boolean done = false;
        for(int k=i;k<j;k++) {
            done = true;
            if(nums[k] > nums[k+1]) {
                swap(nums, k, k+1);
                done = false;
            }
        }
        return done;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
