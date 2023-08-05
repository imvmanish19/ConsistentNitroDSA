package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,40,1,1,23,24,90,10};
        bubbleSort(arr);
        System.out.println("Ascending: "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] nums) {
        int N = nums.length;
        for(int i=0;i<N-1;i++) {
            bubble(nums, 0, N-i-1);
        }
    }

    private static void bubble(int[] nums, int i, int j) {
        for(int k=i;k<j;k++) {
            if(nums[k] > nums[k+1]) {
                swap(nums, k, k+1);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
