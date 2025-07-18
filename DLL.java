package PacJava;

public class DLL {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    DLL() {
        this.head = null;
        this.tail = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void delete(int ele) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == ele) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        if (tail.data == ele) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return;
        }

        Node current = head.next;
        while (current != null) {
            if (current.data == ele) {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }

        System.out.println(ele + " not found in the list.");
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.delete(10);
        System.out.println("\nAfter deleting 10 (head):");
        list.display();

        list.delete(40);
        System.out.println("\nAfter deleting 40 (tail):");
        list.display();

        list.delete(20);
        System.out.println("\nAfter deleting 20 (middle element):");
        list.display();

        list.delete(100);
        System.out.println("\nTrying to delete 100 (not in list):");
        list.display();
    }
}
