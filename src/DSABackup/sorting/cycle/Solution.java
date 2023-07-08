package DSABackup.sorting.cycle;

class Solution {
    public static void main(String[] args) {
        int[] nums = {5,6,4,0,2,1,9,3,8,7,11,10};
        System.out.println(minSwapsCouples(nums));
    }
    public static int minSwapsCouples(int[] row) {
        int start = 0;
        int end = 1;
        int swaps = 0;
        while(end < row.length) {
            int target = 0;
            if(row[start] == 0) {
                target = 1;
            } else if(row[start] == 1) {
                target = 0;
            }else if(row[start] % 2 == 0) {
                target = row[start] + 1;
            } else if(row[start] % 2 == 1) {
                target = row[start] - 1;
            }
            if(Math.abs(row[start] - row[end]) != 1) {
                for(int i=end+1;i<row.length;i++) {
                    if(row[i] == target) {
                        int temp = row[i];
                        row[i] = row[end];
                        row[end] = temp;
                        break;
                    }
                }
                swaps++;
            }
            start++;
            end++;
        }
        return swaps;
    }
}