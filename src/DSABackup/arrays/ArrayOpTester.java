package DSABackup.arrays;

public class ArrayOpTester {
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations(10);
        arrayOperations.initializeWithRandomValues(5);
        arrayOperations.printElements();
        arrayOperations.insert(5,1000);
        arrayOperations.printElements();
        System.out.println(arrayOperations.length);
        arrayOperations.delete(2);
        arrayOperations.delete(4);
        arrayOperations.printElements();
    }
}
