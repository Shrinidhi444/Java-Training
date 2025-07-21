package PacJava;

public class HeightLevelT {

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

    int height(Node root) {
        if (root == null) return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight, rheight) + 1;
    }

    public static void main(String[] args) {
        HeightLevelT tree = new HeightLevelT();
        int[] arr = {50, 30, 70, 20, 40, 60, 80};
        for (int val : arr) {
            tree.root = tree.insert(tree.root, val);
        }

        int h = tree.height(tree.root);
        System.out.println("Levele in Tree: " + h);
        System.out.println("Height of Tree: " + h);
    }
}
