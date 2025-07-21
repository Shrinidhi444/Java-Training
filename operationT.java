package PacJava;

public class operationT {

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

    operationT() {
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

    int SumEven(Node root) {
        int count = 0;
        if (root != null) {
            count += SumEven(root.left);
            if (root.data % 2 == 0) {
                count += root.data;
            }
            count += SumEven(root.right);
        }
        return count;
    }

    void SumOdd(Node root) {
        if (root != null) {
            SumOdd(root.left);
            if (root.data % 2 != 0) {
                System.out.print("Odd Number: " + root.data + " ");
            }
            SumOdd(root.right);
        }
    }

    void SumPrime(Node root) {
        if (root != null) {
            SumPrime(root.left);
            if (isPrime(root.data)) {
                System.out.print("Prime Number: " + root.data + " ");
            }
            SumPrime(root.right);
        }
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        operationT m = new operationT();

        m.root = m.insert(m.root, 50);
        m.root = m.insert(m.root, 70);
        m.root = m.insert(m.root, 40);
        m.root = m.insert(m.root, 99);
        m.root = m.insert(m.root, 76);

        int evenSum = m.SumEven(m.root);
        System.out.println("Sum of Even Numbers: " + evenSum);

        System.out.print("Odd Numbers: ");
        m.SumOdd(m.root);
        System.out.println();

        System.out.print("Prime Numbers: ");
        m.SumPrime(m.root);
        System.out.println();
    }
}
