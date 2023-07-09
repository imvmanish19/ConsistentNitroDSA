package ImpQuestions.Arrays.Implementation;

public class DynamicArray {
    private int[] nums;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 2;
        nums = new int[this.capacity];
        this.size = 0;
    }

    public void add(int element) {
        if(size == capacity) {
            System.out.println("Capacity Exceeded, Increasing Size");
            increaseSize();
        }
        this.nums[size++] = element;
    }

    public void insert(int element, int index) {
        if(size == capacity) {
            System.out.println("Capacity Exceeded, Increasing Size");
            increaseSize();
        }
        for(int i=size-1;i>=index;i--) {
            nums[i+1] = nums[i];
        }
        nums[index] = element;
        size+=1;
    }

    public int remove(int index) {
        int element = nums[index];
        for(int i=index;i<size-1;i++) {
            nums[i] = nums[i+1];
        }
        size-=1;
        return element;
    }

    public void display() {
        for(int i=0;i<size;i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public void increaseSize() {
        this.capacity *= 2;
        int[] expoArr = new int[this.capacity];
        for(int i=0;i<size;i++) {
            expoArr[i] = nums[i];
        }
        nums = expoArr;
    }

}
