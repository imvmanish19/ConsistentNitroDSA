package recursion.revision;

import recursion.basics.InputTaker;

public class FirstIndex {
    public static void main(String[] args) {
        int arr[] = {12,2,100,2,9,2};
        int target = InputTaker.inputInt();
        System.out.println(firstIndex(arr, target, 0));
    }

    private static int firstIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        int expectedIndex = firstIndex(arr, target, index + 1);
        if(arr[index] == target) {
            return index;
        }
        return expectedIndex;
    }
}
