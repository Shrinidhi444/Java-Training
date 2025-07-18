package PacJava;
import java.util.*;

public class RemoveVowels {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String d) {
            this.data = d;
            this.next = null;
        }
    }

    void insert(String data) {
        Node newNode = new Node(data);
        head = newNode;
    }

    String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    void display() {
        if (head == null) {
            System.out.println("empty");
        } else {
            System.out.println(removeVowels(head.data));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveVowels list = new RemoveVowels();

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        list.insert(name);

        System.out.println("Name after removing vowels:");
        list.display();
    }
}
