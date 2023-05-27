package linkedList.revision.singly;

public class SinglyLinkedList {
    private Node head;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head != null) {
            node.next = head;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node temp = head;
        if(temp == null) {
            insertFirst(val);
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size-1) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++) {

        }
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }
}
