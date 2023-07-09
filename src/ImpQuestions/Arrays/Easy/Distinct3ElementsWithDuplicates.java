package ImpQuestions.Arrays.Easy;

public class Distinct3ElementsWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {90, 4, 3, 4, 3, 50, 230, 90};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] >= firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i] >= secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if(arr[i] >= thirdMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println("First Max: "+firstMax);
        System.out.println("Second Max: "+secondMax);
        System.out.println("Third Max: "+thirdMax);
    }
}
