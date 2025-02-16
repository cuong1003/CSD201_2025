package MyLinkedlist;

public class main {
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        a.addFirst(10);
        a.addFirst(20);
        a.addFirst(30);
        a.addLast(5);
        a.addIndex(100,2);
        a.display();
        System.out.println(a.length());
        a.deleteFirst();
        a.display();
        System.out.println(a.length());
    }
}
