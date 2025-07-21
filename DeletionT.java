package PacJava;

public class DeletionT {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    DeletionT() {
        this.root = null;
    }

    Node insert(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
        } else if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    Node delete(Node root, int val) {
        if (root == null) {
            return null;
        } else if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = min(root.right);
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    int min(Node root) {
        int minimum = root.data;
        while (root.left != null) {
            root = root.left;
            minimum = root.data;
        }
        return minimum;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String args[]) {
        DeletionT tree = new DeletionT();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("Inorder before Deletion: ");
        tree.inorder(tree.root);
        System.out.println();

        tree.root = tree.delete(tree.root, 70); 

        System.out.print("Inorder after Deletion: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}



