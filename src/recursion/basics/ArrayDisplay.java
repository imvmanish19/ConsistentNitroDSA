package recursion.basics;

public class ArrayDisplay {
    public static void main(String[] args) {
        int arr[] = InputTaker.inputArray(5);
        InputTaker.printArray(arr);
//        displayArray(arr, 0);
        displayArrayReverse(arr, 0);
    }

    private static void displayArray(int[] arr, int index) {
        if(index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        displayArray(arr, index+1);
    }

    private static void displayArrayReverse(int[] arr, int index) {
        if(index == arr.length) {
            return;
        }
        displayArrayReverse(arr, index+1);
        System.out.println(arr[index]);
    }
}
