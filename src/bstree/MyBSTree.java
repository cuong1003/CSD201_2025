package bstree;
import java.util.*;
public class MyBSTree {
    Node root;

    public MyBSTree() {
        this.root = null;
    }

    public void clear() {
        this.root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    void insert(int x) {
        if (root == null) {
            root = new Node(x);
            return;
        }
        Node f,p;
        p=root;f=null;
        while(p!=null) {
            if (p.info == x) {
                System.out.println(" The key " + x + " already exists, no insertion");
                return;
            }
            f=p;
            if(x<p.info) {
                p = p.left;
            } else
                p=p.right;
            }
            if(x<f.info) {
                f.left = new Node(x);
            } else
                f.right=new Node(x);
    }
    public void visit(Node p) {
        System.out.print(p.info + " ");
    }
    public void insertMany(int[] a) {
        for(int i = 0; i < a.length; i ++) {
            insert(a[i]);
        }
    }
    public void breadth() {
        if (isEmpty()) {
            return;
        }
    }
    void preOrder(Node p)
    { if(p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    void inOrder(Node p)
    { if(p==null) return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    void postOrder(Node p)
    { if(p==null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

}
