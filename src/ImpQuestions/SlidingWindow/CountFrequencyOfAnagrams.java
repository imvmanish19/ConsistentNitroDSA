package ImpQuestions.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfAnagrams {
    public static void main(String[] args) {
        String str = "a";
        String pattern = "a";
        int countAnagrams = countFrequencyOfAnagrams(str, pattern);
        System.out.println(countAnagrams);
    }

    private static int countFrequencyOfAnagrams(String str, String pattern) {
        char[] chars = str.toCharArray();
        char[] patternChars = pattern.toCharArray();
        int k = patternChars.length;
        Map<Character, Integer> freqMap = new HashMap<>();
        for(int i=0;i<patternChars.length;i++) {
            if(freqMap.containsKey(patternChars[i])) {
                freqMap.put(patternChars[i], freqMap.get(patternChars[i]) + 1);
            } else {
                freqMap.put(patternChars[i], 1);
            }
        }
        int start = 0;
        int anagrams = 0;
        /* To avoid traversal of map to find if all key values are 0 **/
        int count = freqMap.size();
        for(int end=0;end<chars.length;end++) {
            if(freqMap.containsKey(chars[end])) {
                freqMap.put(chars[end], freqMap.get(chars[end]) - 1);
                if(freqMap.get(chars[end]) == 0) {
                    count--;
                }
            }
            if(end-start+1 == k) {
                if(count == 0) {
                    anagrams++;
                }
                if(freqMap.containsKey(chars[start])) {
                    if(freqMap.get(chars[start]) == 0) {
                        count++;
                    }
                    freqMap.put(chars[start], freqMap.get(chars[start]) + 1);
                }
                start++;
            }
        }
        return anagrams;
    }
}
