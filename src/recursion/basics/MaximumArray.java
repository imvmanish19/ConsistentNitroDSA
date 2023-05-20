package recursion.basics;

public class MaximumArray {
    public static void main(String[] args) {
        int arr[] = InputTaker.inputArray(10);
        InputTaker.printArray(arr);
        System.out.println(maximum(arr, 0));
    }

    private static int maximum(int[] arr, int index) {
        if(arr.length == index) {
            return Integer.MIN_VALUE;
        }
        int max = maximum(arr, index+1);
        if(arr[index] > max) {
            max = arr[index];
        }
        return max;
    }
}
