package Stack;

public class main {
    public static void main(String[] args) {
        MyStack a = new MyStack();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.display();
        a.pop();
        a.display();
        a.pop();
        a.display();
    }
}
