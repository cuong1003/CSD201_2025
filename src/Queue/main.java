package Queue;

public class main {
    public static void main(String[] args) {
        MyQueue a = new MyQueue();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        a.enqueue(40);
        a.display();
        a.dequeue();
        a.display();
    }
}
