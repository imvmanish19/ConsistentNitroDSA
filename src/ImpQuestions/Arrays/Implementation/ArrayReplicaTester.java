package ImpQuestions.Arrays.Implementation;

public class ArrayReplicaTester {
    public static void main(String[] args) {
        ArrayReplica array = new ArrayReplica(10);
        array.add(1);
        array.add(10);
        array.add(20);
        array.add(4);
        array.add(1);
        array.add(10);
        array.add(20);
        array.add(4);
        array.add(20);
        array.add(4);
        array.insert(100,0);
        array.insert(29,5);
        array.remove(1);
        array.remove(4);
        array.remove(2);
        array.remove(0);
        array.remove(1);
        array.remove(0);
        array.display();
    }
}
