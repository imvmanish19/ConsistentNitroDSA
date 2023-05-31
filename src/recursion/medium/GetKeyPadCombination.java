package recursion.medium;

import recursion.basics.InputTaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetKeyPadCombination {
    public static void main(String[] args) {
        List<String> mapOfChars = Arrays.asList("abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".+");
        String str = InputTaker.inputString();
        System.out.println(getKeypadCombination(str, mapOfChars));
    }

    private static List<String> getKeypadCombination(String str, List<String> mapOfChars) {
        if(str.length() == 0) {
            return Arrays.asList("");
        }
        int number = str.charAt(0) - '0';
        String restOfString = str.substring(1);
        List<String> outputList = getKeypadCombination(restOfString, mapOfChars);
        List<String> originalList = new ArrayList<>();
        String mainString = mapOfChars.get(number-1);
        for(int i=0;i<mainString.length();i++) {
            for(String output: outputList) {
                originalList.add(mainString.charAt(i)+output);
            }
        }
        return originalList;
    }
}
