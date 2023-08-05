package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,40,1,1,23,24,90,10};
        insertionSortAscending(arr);
        System.out.println("Ascending: "+ Arrays.toString(arr));
        int[] nums = {2,3,40,1,1,23,24,90,10};
        insertionSortDescending(nums);
        System.out.println("Descending: "+ Arrays.toString(nums));
    }

    private static void insertionSortAscending(int[] nums) {
        for(int i=1;i<nums.length;i++) {
            int j = i;
            while(j > 0 && nums[j] < nums[j-1]) {
                swap(nums, j, j -1);
                j--;
            }
        }
    }

    private static void insertionSortDescending(int[] nums) {
        for(int i=1;i<nums.length;i++) {
            int j = i;
            while(j > 0 && nums[j] > nums[j-1]) {
                swap(nums, j, j -1);
                j--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
