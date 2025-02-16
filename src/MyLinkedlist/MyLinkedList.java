package MyLinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addIndex(int data, int index) {
        Node newNode = new Node(data);
        if (index==0) {
            addFirst(data);
            return;
        } else {
            Node temp = head;
            for (int i=0;i<index-1;i++) {
                if (temp == null) {
                    System.out.println("Index vuot qua do dai danh sach");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }
    public void display() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public boolean isEmpty() {
        if (head!=null) {
            return false;
        } else {
            return true;
        }
    }
    public void deleteFirst() {
        if (isEmpty()) {
            return;
        } else {
            head = head.next;
        }
    }
    public int length(){
        Node temp = head;
        int count =0;
        while(temp != null){
            count ++;
            temp = temp. next;
        }
        return count;
    }
    public void deleteIndex(int data) {
        Node temp = head;
        for (int i = 0; i< length();i++) {
            if(temp.data == data) {

            }
        }
    }

}
