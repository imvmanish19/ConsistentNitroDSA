package ProgrammingPathshala.Sorting;

public class Solution {
    public static int countWaysToExpressAsSum(int targetSum) {
        if (targetSum < 2 || targetSum > 12) {
            return 0;  // The targetSum cannot be expressed as a sum of two dice faces
        }

        int ways = 0;
        for (int face1 = 1; face1 <= 6; face1++) {
            int face2 = targetSum - face1;
            if (face2 >= 1 && face2 <= 6) {
                ways++;
            }
        }

        return ways;
    }

    public static void main(String[] args) {
        int targetSum = 13;  // Change this to the desired target sum
        int ways = countWaysToExpressAsSum(targetSum);
        System.out.println("Number of ways to express " + targetSum + " as the sum of two dice faces: " + ways);
    }
}







