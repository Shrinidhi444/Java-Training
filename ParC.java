package PacJava;
import java.util.Scanner;

public class ParC{

    public static boolean isBalanced(String expr) {
        char[] stack = new char[expr.length()];
        int top = -1;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;  // Push
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) {
                    return false;
                }
                char open = stack[top--];  // Pop
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String expression = scanner.nextLine();

        if (isBalanced(expression)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}
