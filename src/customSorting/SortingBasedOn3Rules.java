package customSorting;

import java.util.*;

public class SortingBasedOn3Rules {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (Integer integer : arr) {
            freqMap.put(integer, freqMap.getOrDefault(integer, 0) + 1);
        }
        List<Triplet> triplets = new ArrayList<>();
        for(int i=0;i< arr.size();i++) {
            triplets.add(new Triplet(arr.get(i), freqMap.get(arr.get(i)) ,i));
        }
        System.out.println(triplets);
        Comparator<Triplet> freqComparator = new Comparator<Triplet>() {
            @Override
            public int compare(Triplet k1, Triplet k2)
            {

                // Compare value by frequency
                int freqCompare = freqMap.get(k2.element).compareTo(freqMap.get(k1.element));

                // Compare value if frequency is equal
                int valueCompare = k1.element.compareTo(k2.element);

                int indexCompare = k1.index.compareTo(k2.index);

                // If frequency is equal, then just compare by value, otherwise -
                // compare by the frequency.
                if (freqCompare != 0)
                    return freqCompare;
                if(valueCompare != 0)
                    return valueCompare;
                return indexCompare;
            }
        };
        Collections.sort(triplets, freqComparator);
        System.out.println(triplets);
    }
}
