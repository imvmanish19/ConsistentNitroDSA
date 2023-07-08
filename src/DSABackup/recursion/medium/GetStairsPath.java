//package DSABackup.recursion.medium;
//
//import DSABackup.recursion.basics.InputTaker;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class GetStairsPath {
//    public static void main(String[] args) {
//        int n = InputTaker.inputInt();
//        System.out.println(stairsPath(n, ""));
//    }
//
//    private static void stairsPath(int n, String path) {
//        if(n<=0) {
//
//        }
//        List<String> pathOne = stairsPath(n-1);
//        List<String> pathTwo = stairsPath(n-2);
//        List<String> pathThree = stairsPath(n-3);
//        List<String> paths = new ArrayList<>();
//        for(String path: pathOne) {
//            paths.add(n + path);
//        }
//        for(String path: pathTwo) {
//            paths.add(n + path);
//        }
//        for(String path: pathThree) {
//            paths.add(n + path);
//        }
//        return paths;
//    }
//}
