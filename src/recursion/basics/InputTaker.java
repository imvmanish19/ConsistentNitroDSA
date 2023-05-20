package recursion.basics;

import java.util.Random;
import java.util.Scanner;

public class InputTaker {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        System.out.println("Enter a number?");
        return sc.nextInt();
    }

    public static String inputString() {
        System.out.println("Enter string?");
        return sc.next();
    }

    public static int[] inputArray(int size) {
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = new Random().nextInt(20);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for(int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
