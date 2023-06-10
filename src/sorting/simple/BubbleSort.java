package sorting.simple;

import recursion.basics.InputTaker;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,0,5,0,1};
        bubbleSort(arr);
        InputTaker.printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            boolean isSwapped = false;
            for(int j=0;j<n-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
    }
}
