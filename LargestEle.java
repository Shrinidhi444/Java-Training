package PacJava;
import java.util.Scanner;
import java.util.Stack;

public class LargestEle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            sum += result[i];
            stack.push(arr[i]);
        }

        System.out.print("Next greater elements: ");
        for(int val : result) {
            System.out.print(val + " ");
        }
        System.out.println("\nSum (including -1): " + sum);
    }
}


