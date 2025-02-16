package Queue;

public class MyQueue {
    private Node front;
    private Node rear;
    private int size;

    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;

        }
        size++;

    }

    public void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
    }
}
