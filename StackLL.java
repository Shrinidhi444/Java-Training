package PacJava;
public class StackLL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    StackLL() {
        this.head = null;
    }

   
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

  
    void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped: " + head.data);
        head = head.next;
    }

 
    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            Node current = head;
            System.out.print("Stack: ");
            while (current != null) {
                System.out.print(current.data + "  ");
                current = current.next;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
    }
}
