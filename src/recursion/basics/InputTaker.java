package recursion.basics;

import java.util.Random;
import java.util.Scanner;

public class InputTaker {
    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number?");
        return sc.nextInt();
    }

    public static int[] inputArray(int size) {
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = new Random().nextInt(20);
        }
        return arr;
    }
}
