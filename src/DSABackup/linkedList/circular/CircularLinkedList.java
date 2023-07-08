package DSABackup.linkedList.circular;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public void insertFirst() {
        Node node = new Node(100);
        node.next = head;
        if(head == null) {
            head = node;
            tail = node;
        }
        head = node;
    }
}
