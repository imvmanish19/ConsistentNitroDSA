package recursion.revision;

import recursion.basics.InputTaker;

public class AllIndices {
    public static void main(String[] args) {
        int arr[] = {12,2,100,2,9,2};
        int target = InputTaker.inputInt();
        InputTaker.printArray(allIndices(arr, target, 0, 0));
    }

    private static int[] allIndices(int[] arr, int target, int index, int count) {
        if(index == arr.length) {
            return new int[count];
        }
        int[] arrSoFar;
        if(arr[index] == target) {
            arrSoFar  = allIndices(arr, target, index+1, count+1);
            arrSoFar[count] = index;
        } else {
            arrSoFar = allIndices(arr, target, index+1, count);
        }
        return arrSoFar;

        /** Without refactoring...
         *          if(arr[index] == target) {
         *             arrSoFar  = allIndices(arr, target, index+1, count+1);
         *             arrSoFar[count] = index;
         *             return arrSoFar;
         *         } else {
         *             arrSoFar = allIndices(arr, target, index+1, count);
         *             return arrSoFar;
         *         }
         */
    }
}
