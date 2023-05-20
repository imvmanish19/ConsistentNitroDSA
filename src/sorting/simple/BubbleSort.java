package sorting.simple;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12,7,100,2,9,1};
        bubbleSort(arr);
        printArr(arr);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=n-1;i>=0;i--) {
            for(int j=0;j<i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        for(int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
