package sorting.simple;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {12,7,100,2,9,1};
//        selectionSort(arr);
        minSelectionSort(arr);
        printArr(arr);
    }

//    private static void selectionSort(int[] arr) {
//        for(int i=0;i<arr.length-1;i++) {
//            int maxIndex = i;
//            for(int j=i;j<arr.length;j++) {
//                if(arr[j] > arr[maxIndex]) {
//                    maxIndex = j;
//                }
//            }
//            int temp = arr[maxIndex];
//            arr[maxIndex] = arr[i];
//            arr[i] = temp;
//        }
//    }

    private static void minSelectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int minIndex = i;
            for(int j=i;j<arr.length;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArr(int[] arr) {
        for(int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
