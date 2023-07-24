package ImpQuestions.SlidingWindow;

import java.util.*;

public class MaximumOfAllSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,0,5};
        int k = 3;
        int[] maximums = computeMaximums(nums, k);
        System.out.println(Arrays.toString(maximums));
    }

    private static int[] computeMaximums(int[] nums, int k) {
        int start = 0;
        int[] maximums = new int[nums.length-k+1];
        int idx = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        for(int end=0;end<nums.length;end++) {
            while(queue.size() > 0 && queue.getLast() < nums[end]) {
                queue.removeLast();
            }
            queue.addLast(nums[end]);
            if(end-start+1 == k) {
                maximums[idx++] = queue.getFirst();
                if(nums[start] == queue.getFirst()) {
                    queue.removeFirst();
                }
                start++;
            }
        }
        return maximums;
    }
}
