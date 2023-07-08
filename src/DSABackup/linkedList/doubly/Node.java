package DSABackup.linkedList.doubly;

public class Node {
    public int val;
    public Node prev;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node nextNode, Node prevNode) {
        this.val = val;
        this.next = nextNode;
        this.prev = prevNode;
    }
}
