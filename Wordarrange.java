package PacJava;

public class Wordarrange {

    Node root;

    class Node {
        String data;
        Node left;
        Node right;

        Node(String d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    Wordarrange() {
        this.root = null;
    }

    Node insert(Node root, String val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
        } else if (val.compareTo(root.data) < 0) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String args[]) {
        Wordarrange m = new Wordarrange();
        m.root = m.insert(m.root, "banana");
        m.root = m.insert(m.root, "apple");
        m.root = m.insert(m.root, "grape");
        m.root = m.insert(m.root, "mango");
        m.root = m.insert(m.root, "cherry");

        System.out.print("Words in Ascending Order: ");
        m.inorder(m.root);
    }
}