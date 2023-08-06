package ProgrammingPathshala.Sorting;

import java.util.*;

public class SolveSextupleEquation {
    public static void main(String[] args) {
        int[] nums = {1};
        int noOfSextuplesSatisfyingEquation = computeEquationCount(nums);
        System.out.println(noOfSextuplesSatisfyingEquation);
    }

    private static int computeEquationCount(int[] nums) {
        int N = nums.length;
        List<Integer> LHS = new ArrayList<>();
        Map<Integer, Integer> RHS = new HashMap<>();
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                for(int k=0;k<N;k++) {
                    LHS.add(nums[i] * nums[j] + nums[k]);
                }
            }
        }
        /** Map to avoid Sort and Binary Search **/
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                for(int k=0;k<N;k++) {
                    if(nums[i] != 0) {
                        int value = nums[i] * (nums[j] + nums[k]);
                        RHS.put(value, RHS.getOrDefault(value, 0) + 1);
                    }
                }
            }
        }
        int count = 0;
        for(int val: LHS) {
            if(RHS.containsKey(val)) {
                count+=RHS.get(val);
            }
        }
        return count;
    }
}
