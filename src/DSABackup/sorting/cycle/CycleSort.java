package DSABackup.sorting.cycle;

import DSABackup.recursion.basics.InputTaker;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {6,3,5,2,1,4};
        cycleSort(arr);
        InputTaker.printArray(arr);
    }

    private static void cycleSort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i] - 1;
            if(i != correctIndex) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
//            if(arr[i] != arr[correctIndex]) {
//                int temp = arr[i];
//                arr[i] = arr[correctIndex];
//                arr[correctIndex] = temp;
//            } else {
//                i++;
//            }
        }
    }
}
