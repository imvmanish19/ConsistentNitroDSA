package linkedList.design;

public class MyHashSet {
    private Node[] set;
    private int size;
    public MyHashSet() {
        size = 100;
        set = new Node[size];
    }

    public void add(int key) {
        int position = hash(key);
        Node node = new Node(key);
        if(contains(key)) {
            return;
        }
        if(set[position] == null) {
            set[position] = node;
        } else {
            Node temp = set[position];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void remove(int key) {
        int position = hash(key);
        Node temp = set[position];
        Node prev = null;
        if(temp == null) {
            return;
        }
        if(!contains(key)) {
            return;
        }
        if(temp.val == key) {
            set[position] = null;
        }
        while(temp.val != key) {
            prev = temp;
            temp = temp.next;
        }
        if(prev != null) {
            prev.next = temp.next;
        }
    }

    public boolean contains(int key) {
        Node temp = set[hash(key)];
        while(temp != null) {
            if(temp.val == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int hash(int key) {
        return key % size;
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
