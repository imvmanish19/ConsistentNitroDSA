package DSABackup.sorting.simple;

import DSABackup.recursion.basics.InputTaker;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1122,4,1,10,5,110,100};
        insertionSort(arr);
        InputTaker.printArray(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int x = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }
}
