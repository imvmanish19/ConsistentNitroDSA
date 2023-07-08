package DSABackup.linkedList.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public int getIndex(int val) {
        Node node = head;
        int index = 0;
        while(node != null) {
            if(node.val == val) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }

   public void insertAtIndex(int val, int index) {

   }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("End\n");
    }

    public void displayReverse() {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.prev;
        }
        System.out.print("End\n");
    }

}
