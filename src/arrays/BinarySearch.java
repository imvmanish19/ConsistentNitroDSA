package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(binarySearch(numbers, target));
    }

    private static int binarySearch(int numbers[], int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == target) {
                return mid;
            } else if(numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}