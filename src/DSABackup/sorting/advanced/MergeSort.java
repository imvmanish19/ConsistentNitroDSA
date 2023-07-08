package DSABackup.sorting.advanced;

import DSABackup.recursion.basics.InputTaker;
import DSABackup.sorting.support.Merge2SortedPartsOfArray;

public class MergeSort {
    public static void main(String[] args) {
        int[] A = {1,10,5,7,9,2,4,6,11,8,10};
        mergeSort(A, A.length);
        InputTaker.printArray(A);
    }

    private static void mergeSort(int[] A, int n) {
        int p,low,high,mid;
        for(p=2;p<=n;p*=2) {
            for(int i=0;i+p-1<n;i=i+p) {
                low = i;
                high = i+p-1;
                mid = (low+high)/2;
                Merge2SortedPartsOfArray.mergeSortedArrays(A, low, mid, high);
            }
        }
        if(p/2 < n) {
            Merge2SortedPartsOfArray.mergeSortedArrays(A, p/2, (p/2+(n-1))/2, n-1);
            Merge2SortedPartsOfArray.mergeSortedArrays(A, 0, p/2, n-1);
        }
    }
}
