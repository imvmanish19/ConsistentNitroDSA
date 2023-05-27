package recursion.revision;

import recursion.basics.InputTaker;

public class LastIndex {
    public static void main(String[] args) {
        int arr[] = {12,2,100,2,9,2};
        int target = InputTaker.inputInt();
        System.out.println(lastIndexOfOccurence(arr, target, 0));
    }

    private static int lastIndexOfOccurence(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        int expectedIndex = lastIndexOfOccurence(arr, target, index + 1);
        if(expectedIndex == -1) {
            if(arr[index] == target) {
                return index;
            } else {
                return -1;
            }
        } else {
            return expectedIndex;
        }

        /** Refactored Code
         *         int expectedIndex = lastIndexOfOccurence(arr, target, index + 1);
         *         if(expectedIndex == -1) {
         *             if(arr[index] == target) {
         *                 return index;
         *             }
         *         }
         *         return expectedIndex;
         */
    }
}
