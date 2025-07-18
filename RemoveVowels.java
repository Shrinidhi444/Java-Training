package PacJava;

public class RemoveVowels {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    RemoveVowels() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    void InsertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void InsertMid(int data, int prev) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Empty");
            return;
        } else {
            Node current = head;
            while (current != null && current.data != prev) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Previous node " + prev + " not found.");
            }
        }
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("Empty");
            return;
        } else if (head.data == data) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Element " + data + " not found.");
            }
        }
    }

    void reverse(Node node) {
        if (node == null) {
            return;
        }
        reverse(node.next);
        System.out.print(node.data + " ");
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    void displayPrime() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node current = head;
        System.out.print("Prime numbers: ");
        while (current != null) {
            if (isPrime(current.data)) {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	RemoveVowels m = new RemoveVowels();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.insert(50);
        m.insert(11);
        m.insert(13);
        m.insert(17);
        m.display();

        System.out.println();
        m.InsertFirst(90);
        m.display();

        System.out.println();
        m.InsertMid(70, 30);
        m.display();

        System.out.println();
        m.delete(70);
        m.display();

        System.out.println("\nReversed:");
        m.reverse(m.head);
        System.out.println();

        m.displayPrime();
    }
}
