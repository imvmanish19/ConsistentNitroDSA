package DSABackup.linkedList.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(22);
        doublyLinkedList.insertLast(77);
        doublyLinkedList.insertLast(120);
        System.out.println(doublyLinkedList.getIndex(77));
        doublyLinkedList.display();
    }
}
