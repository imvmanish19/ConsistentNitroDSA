package sorting.support;

import recursion.basics.InputTaker;

public class Merge2SortedPartsOfArray {
    public static void main(String[] args) {
        int[] A = {1,3,5,7,9,2,4,6,8,10};
        mergeSortedArrays(A, 0,(0+A.length-1)/2 , A.length - 1);
        InputTaker.printArray(A);
    }

    public static void mergeSortedArrays(int[] A, int low, int mid, int high) {
        int n = A.length;
        int[] C = new int[n];
        int i=low, j=mid+1, k=low;
        while(i <= mid && j <= high) {
            if(A[i] < A[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = A[j++];
            }
        }
        while(i<=mid) {
            C[k++] = A[i++];
        }
        while(j<=high) {
            C[k++] = A[j++];
        }
        for(int index=low;index<=high;index++) {
            A[index] = C[index];
        }
    }
}
