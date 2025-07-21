package PacJava;

public class DT {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    
    Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    
    int minValue(Node root) {
        while (root.left != null) root = root.left;
        return root.data;
    }

    
    Node delete(Node root, int val) {
        if (root == null) return null;
        if (val < root.data) root.left = delete(root.left, val);
        else if (val > root.data) root.right = delete(root.right, val);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

   
    Node deleteInRange(Node root, int low, int high) {
        if (root == null) return null;
        root.left = deleteInRange(root.left, low, high);
        root.right = deleteInRange(root.right, low, high);
        if (root.data >= low && root.data <= high) {
            return delete(root, root.data);
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

    
    public static void main(String[] args) {
        DT tree = new DT();
        int[] arr = {50, 30, 70, 20, 40, 60, 80};
        for (int val : arr) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Original Tree (Inorder):");
        tree.inorder(tree.root);

        tree.root = tree.deleteInRange(tree.root, 30, 50);
        System.out.println("\nTree after deleting nodes in range [30, 50]:");
        tree.inorder(tree.root);
    }
}
