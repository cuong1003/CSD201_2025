package Stack;

public class MyStack {
    private Node top;
    private int length;

    public MyStack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() {
        if (!isEmpty()) {
            int data = top.data;
            top = top.next;
            length--;
            return data;
        }
        return 0;
    }
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }
}
