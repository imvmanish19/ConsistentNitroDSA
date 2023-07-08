package DSABackup.searching;

public class FirstOccuranceUsingBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,2,2};
        int firstIndex = firstIndexSearch(nums, 2);
        int lastIndex = lastIndexSearch(nums, 2);
        System.out.println(firstIndex+" "+lastIndex);
        int firstIndex2 = firstIndexSearchByVivekSirApproach(nums, 2);
        int lastIndex2 = lastIndexSearchByVivekSirApproach(nums, 2);
        System.out.println(firstIndex2+" "+lastIndex2);
    }

    private static int firstIndexSearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int possibleAns = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                possibleAns = mid;
                high = mid - 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return possibleAns;
    }

    private static int lastIndexSearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int possibleAns = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                possibleAns = mid;
                low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return possibleAns;
    }

    private static int firstIndexSearchByVivekSirApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                if(mid == 0) {
                    return mid;
                } else if(nums[mid-1] != target) {
                    return mid;
                }
                high = mid - 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int lastIndexSearchByVivekSirApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                if(mid == nums.length-1) {
                    return mid;
                } else if(nums[mid+1] != target) {
                    return mid;
                }
                low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
