package DSABackup.recursion.medium;

import DSABackup.recursion.basics.InputTaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String str = InputTaker.inputString();
        List<String> output = getSubsequence(str);
        System.out.println(output);
    }

    private static List<String> getSubsequence(String str) {
        if(str.length() == 0) {
            return Arrays.asList("");
        }
        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        List<String> outputList = getSubsequence(restOfString);
        List<String> originalList = new ArrayList<>();
        for(String output: outputList) {
            originalList.add(""+output);
            originalList.add(ch+output);
        }
        return originalList;
    }
}
