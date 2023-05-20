package recursion.basics;

public class FirstIndexOfTarget {
    public static void main(String[] args) {
        int arr[] = InputTaker.inputArray(10);
        InputTaker.printArray(arr);
        int target = InputTaker.inputInt();
        InputTaker.printArray(arr);
        System.out.println(firstIndex(arr, 0, target));
    }

    private static int firstIndex(int[] arr, int index, int target) {
        if(index == arr.length) {
            return -1;
        }
        int expectedIndex = firstIndex(arr, index+1, target);
        if(arr[index] == target) {
            return index;
        } else {
            return expectedIndex;
        }
    }

}
