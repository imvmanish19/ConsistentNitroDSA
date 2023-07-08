package DSABackup.arrays;

import java.util.Random;

public class ArrayOperations {
    private int[] nums;
    private int capacity;
    public int length;

    public ArrayOperations(int capacity) {
        this.nums = new int[capacity];
        this.capacity = capacity;
    }

    public void initializeWithRandomValues(int count) {
        Random random = new Random();
        for(int i=0;i<count;i++) {
            this.nums[i] = random.nextInt(100);
        }
        this.length=count;
    }

    public void printElements() {
        for(int i=0;i<capacity;i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void insert(int index, int value) {
        if(index >=0 && index<=length && length<capacity) {
            for(int i=length;i>index;i--) {
                nums[i] = nums[i-1];
            }
            nums[index] = value;
            length++;
        }
    }

    public int delete(int index) {
        int x = -1;
        if(index >=0 && index<length) {
            x = nums[index];
            for(int i=index;i<length-1;i++) {
                nums[i] = nums[i+1];
            }
            length--;
        }
        return x;
    }
}
