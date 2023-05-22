package linkedList.singly;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertFirst(30);
//        list.insertFirst(20);
//        list.insertFirst(10);
        list.insertLast(30);
        list.insertLast(20);
        list.insertLast(10 );
        list.insertAtIndex(100, 2);
        list.display();
        System.out.println(list.removeFirst());
        list.display();
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        list.display();
    }
}
