package randomQuestions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("wbwqjjyqrcbmfzvqjmlg"));
    }
    public static int countGoodSubstrings(String s) {
        int goodSubstrings = 0;
        int start = 0;
        int k = 3;
        Map<Character, Integer> alphabetMap = new HashMap<>();
        for(int end = 0;end<s.length();end++) {
            char ch = s.charAt(end);
            if(alphabetMap.containsKey(ch)) {
                alphabetMap.put(ch, alphabetMap.get(ch) + 1);
            } else {
                alphabetMap.put(ch, 1);
            }
            if(end - start + 1 == k) {
                if(alphabetMap.size() == k) {
                    goodSubstrings++;
                }
                if(alphabetMap.get(s.charAt(start)) > 1) {
                    alphabetMap.put(s.charAt(start), alphabetMap.get(s.charAt(start)) - 1);
                } else {
                    alphabetMap.remove(s.charAt(start));
                }
                start++;
            }
        }
        return goodSubstrings;
    }
}
