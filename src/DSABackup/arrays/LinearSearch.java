package DSABackup.arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = {10,20,30,-40,50,-60};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(linearSearch(numbers, target));
    }

    private static int linearSearch(int numbers[], int target) {
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
