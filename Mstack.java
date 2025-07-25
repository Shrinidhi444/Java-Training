package PacJava;
import java.util.Stack;
import java.util.Scanner;

public class Mstack {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements in Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] a = new int[n];  

		System.out.print("Enter the elements with Spaces:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Stack<Integer> st = new Stack<>();
		for(int i = n - 1; i >= 0; i--) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				a[i] = -1;
			} else {
				a[i] = st.peek();
			}
			st.push(arr[i]);
		}

		System.out.println("Next Greater Elements:");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
