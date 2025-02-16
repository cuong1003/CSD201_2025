package bstree;

public class Main {
    public static void main(String[] args) {
        MyBSTree bstree = new MyBSTree();
        bstree.insert(10);
        bstree.insert(6);
        bstree.insert(15);
        int[] a = {4, 8, 12, 19, 2, 5, 7, 9, 11, 14, 17, 20, 1, 3, 13, 16, 18, 21, 0, 22};
        bstree.insertMany(a);
        System.out.println("PreOrder");
        bstree.preOrder(bstree.root);
        System.out.println();
        System.out.println("In Order");
        bstree.inOrder(bstree.root);
        System.out.println();
        System.out.println("Post Order");
        bstree.postOrder(bstree.root);
        System.out.println();
    }
}
