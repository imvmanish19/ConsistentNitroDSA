package DSABackup.strings;

import java.util.ArrayList;
import java.util.List;

public class Solution{
    public static void main(String[] args) {
        System.out.println(pattern(16).toString());
    }

    public static List<Integer> pattern(int N){
        // code here
        List<Integer> output = new ArrayList<>();
        int num = N;
        do {
            output.add(num);
            if(num > 0) {
                num -= 5;
            } else {
                num += 5;
            }
        } while(num != N);
        output.add(num);
        return output;
    }
}