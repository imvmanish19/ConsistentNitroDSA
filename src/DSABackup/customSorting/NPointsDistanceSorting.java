package DSABackup.customSorting;

import java.util.*;

public class NPointsDistanceSorting {
    public static void main(String[] args) {
        List<List<Integer>> points = new ArrayList<>();
        for(int i=0;i<10;i++) {
            Random r = new Random();
            List<Integer> point = new ArrayList<>();
            point.add(r.nextInt(100));
            point.add(r.nextInt(100));
            points.add(point);
        }
        // Points
        System.out.println(points);
        // sqrt -> logn, better to compare only distances
        Comparator<List<Integer>> pointsComparator = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> p1, List<Integer> p2) {
                int d1 = (p1.get(0) * p1.get(0)) + (p1.get(1) * p1.get(1));
                int d2 = (p2.get(0) * p2.get(0)) + (p2.get(1) * p2.get(1));
                if(d1 < d2) {
                    return -1;
                } else if(d1 > d2) {
                    return 1;
                }
                return 0;
            }
        };
        Collections.sort(points, pointsComparator);
        System.out.println(points);
    }
}
