package ProgrammingPathshala.Sorting;

import java.util.Arrays;

public class TroubleSortOptimized {
    public static void main(String[] args) {
        int[] arr = {10,11,1,7};
        troubleSort(arr);
        System.out.println("Ascending: "+ Arrays.toString(arr));
    }

    private static void troubleSort(int[] nums) {
        int N = nums.length;
        int[] temp1 = new int[(int) Math.ceil(N/2)];
        int[] temp2 = new int[N/2];
        int eidx = 0;
        int oidx = 0;
        for(int i=0;i<N;i++) {
            if(i % 2 == 0) {
                temp1[eidx++] = nums[i];
            } else {
                temp2[oidx++] = nums[i];
            }
        }
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        eidx = 0;
        oidx = 0;
        for(int i=0;i<N;i++) {
            if(i % 2 == 0) {
                nums[i] = temp1[eidx++];
            } else {
                nums[i] = temp2[oidx++];
            }
        }
    }

    private static void troubleSortChatGpt(int[] nums) {
        int N = nums.length;
        int[] evenTemp = new int[N / 2];
        int[] oddTemp = new int[(int) Math.ceil(N / 2)];

        // Separate even and odd elements into different arrays
        for (int i = 0; i < N; i++) {
            int tempIndex = i / 2;
            if (i % 2 == 0) {
                evenTemp[tempIndex] = nums[i];
            } else {
                oddTemp[tempIndex] = nums[i];
            }
        }

        // Sort the separate arrays
        Arrays.sort(evenTemp);
        Arrays.sort(oddTemp);

        // Merge the sorted arrays back into the original array
        for (int i = 0; i < N; i++) {
            int tempIndex = i / 2;
            nums[i] = (i % 2 == 0) ? evenTemp[tempIndex] : oddTemp[tempIndex];
        }
    }


}
