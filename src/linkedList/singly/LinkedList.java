package linkedList.singly;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
         Node node = new Node(val);
         node.next = head;
         head = node;
         if(tail == null) {
             tail = head;
         }
         size+=1;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int removeFirst() {
        if(head == null) {
            System.out.println("No elements in linked list!");
            return -1;
        }
        int val = head.getVal();
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int removeLast() {
        if(tail == null) {
            return -1;
        }
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.getVal();
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getVal()+" -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }
}
