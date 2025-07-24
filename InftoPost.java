package PacJava;
import java.util.Scanner;
import java.util.Stack;

public class InftoPost {

    
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // Infix to Postfix conversion
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If operand, add to result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            
            else if (c == '(') {
                stack.push(c);
            } 
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return "Invalid Expression";
            }
            
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

       
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result.append(stack.pop());
        }

        return result.toString();
    }

   
    static String infixToPrefix(String exp) {
  
        StringBuilder input = new StringBuilder(exp);
        input.reverse();

        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                input.setCharAt(i, ')');
            } else if (c == ')') {
                input.setCharAt(i, '(');
            }
        }

     
        String postfix = infixToPostfix(input.toString());

        
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();

        String postfix = infixToPostfix(exp);
        String prefix = infixToPrefix(exp);

        System.out.println("Postfix expression: " + postfix);
        System.out.println("Prefix expression: " + prefix);
    }
}// A+(B*C-(D/E^F)*G)*H
