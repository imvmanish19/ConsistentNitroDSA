package sorting.simple;

import recursion.basics.InputTaker;

public class InsertInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,0};
        insert(arr, 8);
        InputTaker.printArray(arr);
    }

    private static void insert(int[] arr, int element) {
        int i = 0;
        while(element > arr[i]) {
            i++;
        }
        for(int j = arr.length-2;j>=i-1;j--) {
            arr[j+1] = arr[j];
        }
        arr[i-1] = element;
    }
}
