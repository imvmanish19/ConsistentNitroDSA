package DSABackup.customSorting;

import java.util.*;

// Question 1: Sort Based on frequencies
public class CustomSortingExamples {
    public static void main(String[] args) {
        int[] nums = {7,8,2,4,10,1,11,10,10,13,11,7,8};
        List<Integer> numbers = getNumberList(nums);
        // Question 1: Sort Based on frequencies
        Comparator<Integer> freqComparator = getFrequencyComparator(numbers);
        Collections.sort(numbers, freqComparator);
        System.out.println(numbers); // [2, 4, 1, 13, 7, 8, 11, 11, 7, 8, 10, 10, 10]
        // Question 2: If there is tie between frequency, compare elements
        Comparator<Integer> freqValueComparator = getFrequencyValueComparator(numbers);
        Collections.sort(numbers, freqValueComparator);
        System.out.println(numbers);
    }

    private static Comparator<Integer> getFrequencyValueComparator(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Comparator<Integer> freqComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                int freqValue = map.get(i1).compareTo(map.get(i2));
                int eleValue = i1.compareTo(i2);
                if(freqValue == 0)
                    return eleValue;
                return freqValue;
            }
        };
        return freqComparator;
    }

    private static Comparator<Integer> getFrequencyComparator(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Comparator<Integer> freqComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return map.get(i1).compareTo(map.get(i2));
            }
        };
        return freqComparator;
    }

    private static List<Integer> getNumberList(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for(int num: nums) {
            numbers.add(num);
        }
        return numbers;
    }
}
