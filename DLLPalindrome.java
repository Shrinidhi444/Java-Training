package PacJava;
class DLLPalindrome {
    Node head, tail;

    class Node {
        int data;
        Node next, prev;
        Node(int d) {
            data = d;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && right.next != left) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLLPalindrome dll = new DLLPalindrome();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(2);
        dll.insert(1);

        dll.display();
        System.out.println("Is Palindrome: " + dll.isPalindrome());

        DLLPalindrome dll2 = new DLLPalindrome();
        dll2.insert(1);
        dll2.insert(2);
        dll2.insert(4);

        dll2.display();
        System.out.println("Is Palindrome: " + dll2.isPalindrome());
    }
}
