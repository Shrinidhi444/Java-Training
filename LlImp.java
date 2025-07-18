package PacJava;
import java.util.*;

public class LlImp {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    LlImp() {
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
            System.out.print("Empty");
            return;
        } else {
            Node current = head;
            while (current != null && current.data != prev) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    void delete(int data) {
        if (head == null) {
            System.out.print("Empty");
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
            }
        }
    }
    
    void reverse(Node node) {
    	if(node == null) {
    		return ;
    	}
    	reverse(node.next);
    	System.out.print(node.data+" ");  	
    }
    
    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    void displayP() {
    	if(head == null) {
    		System.out.println("Empty");
    		return ;
    	}
    		Node current = head;
    		System.out.println("Prime numbers :");
    		while(current.next != null) {
    			if(isPrime(current.data)) {
    				System.out.println(current.data + " ");
    			}
    			current=current.next;
    		}
    		System.out.println();
    	}
   
    public static void main(String[] args) {
        LlImp m = new LlImp();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.insert(50);
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
        System.out.println();
        m.reverse(m.head);
        m.displayP();
    }
}
