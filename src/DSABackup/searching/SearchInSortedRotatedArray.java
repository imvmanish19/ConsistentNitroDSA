package DSABackup.searching;

public class SearchInSortedRotatedArray {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,1,2};
        System.out.println(search(nums, 4));
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int pivotIndex = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(mid != nums.length - 1 && nums[mid] > nums[mid+1]) {
                pivotIndex = mid;
                break;
            } else if(nums[mid] <= nums[nums.length - 1]) {
                high = mid - 1;
            } else if(nums[mid] > nums[nums.length - 1]) {
                low = mid + 1;
            }
        }
        int searchPartOne = binarySearch(nums, 0, pivotIndex, target);
        int searchPartTwo = binarySearch(nums, pivotIndex + 1, nums.length - 1, target);
        if(searchPartOne != -1) {
            return searchPartOne;
        } else if(searchPartTwo != -1) {
            return searchPartTwo;
        }
        return -1;
    }

    private static int binarySearch(int[] nums,int low, int high, int target) {
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}

/** Optimized **/
class Solution {
    public int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        if(target > nums[nums.length-1]) {
            return binarySearch(nums, 0, pivotIndex, target);
        }
        return binarySearch(nums, pivotIndex+1, nums.length-1, target);
    }

    private static int findPivotIndex(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int pivotIndex = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] <= nums[nums.length - 1]) {
                high = mid - 1;
            } else {
                if(nums[mid] > nums[mid+1]) {
                    pivotIndex = mid;
                    break;
                } else {
                    low = mid + 1;
                }
            }
        }
        return pivotIndex;
    }

    private static int binarySearch(int[] nums,int low, int high, int target) {
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}