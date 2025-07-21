package PacJava;

public class Boundrytraversal {

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

    void printBoundary(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");

        printLeftBoundary(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightBoundary(root.right);
    }

    void printLeftBoundary(Node node) {
        if (node == null) return;
        if (node.left != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.right);
        }
    }

    void printRightBoundary(Node node) {
        if (node == null) return;
        if (node.right != null) {
            printRightBoundary(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printRightBoundary(node.left);
            System.out.print(node.data + " ");
        }
    }

    void printLeaves(Node node) {
        if (node == null) return;
        printLeaves(node.left);
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeaves(node.right);
    }
   
    public static void main(String[] args) {
        Boundrytraversal tree = new Boundrytraversal();
        int[] arr = {50, 30, 70, 20, 40, 60, 80};
        for (int val : arr) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Boundary Traversal: ");
        tree.printBoundary(tree.root);
        System.out.println();
    }
}

