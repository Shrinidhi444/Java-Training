package PacJava;

import java.util.Scanner;

class WordRev{

    int top;
    String arr[];

    WordRev(int size) {
        arr = new String[size];
        top = -1;
    }

    void push(String word) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = word;
        }
    }

    String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        WordRev stack = new WordRev(words.length);

        // Push each word into the stack
        for (String word : words) {
            stack.push(word);
        }

        System.out.print("Reversed Sentence: ");
        // Pop words to reverse the sentence
        while (stack.top != -1) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
