package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class TroubleSort {
    public static void main(String[] args) {
        int[] arr = {10,11,1,7};
        troubleSort(arr);
        System.out.println("Ascending: "+ Arrays.toString(arr));
    }

    private static void troubleSort(int[] nums) {
        boolean done = false;
        int i = 0;
        int N = nums.length;
        while(!done) {
            done = true;
            i = 0;
            while(i < N - 2) {
                if(nums[i] > nums[i+2]) {
                    swap(nums, i, i+2);
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
