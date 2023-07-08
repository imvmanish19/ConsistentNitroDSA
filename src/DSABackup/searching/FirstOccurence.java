package DSABackup.searching;

import java.util.Arrays;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,2,2};
        int firstIndex = findFirstIndexUsingLinearSearch(nums, 2);
        int lastIndex = findSecondIndexUsingLinearSearch(nums, 2);
        int[] indexes = firstAndLastUsingLinearSearch(nums, 2);
        System.out.println(firstIndex+" "+ lastIndex);
        System.out.println(Arrays.toString(indexes));
    }

    private static int[] firstAndLastUsingLinearSearch(int[] nums, int target) {
        int[] indexes = new int[2];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                indexes[0] = i;
                while(i < nums.length && nums[i] == target) {
                    i++;
                }
                indexes[1] = i-1;
            }
        }
        return indexes;
    }

    private static int[] optimizedLinearSearch(int[] nums, int target) {
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        int[] indexes = {firstIndex, lastIndex};
        return indexes;
    }


    private static int findFirstIndexUsingLinearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int findSecondIndexUsingLinearSearch(int[] nums, int target) {
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
