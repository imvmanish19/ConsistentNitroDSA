package ProgrammingPathshala.Arrays;

public class FrequencyCountOfEverySubarrayOfSizeK {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2,5};
        int k = 3;
        int element = 2;
        printFrequency(nums, k, element);
    }

    private static void printFrequency(int[] nums, int k, int x) {
        int start = 0;
        int count = 0;
        for(int end=0;end<nums.length;end++) {
            if(nums[end] == x) {
                count++;
            }
            if(end-start+1 == k) {
                System.out.print(count + " ");
                if(nums[start] == x) {
                    count--;
                }
                start++;
            }
        }
    }
}
