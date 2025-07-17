package PacJava;

import java.util.Scanner;

class ReverseName {

    int top;
    char arr[];

    ReverseName(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char d) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = d;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        ReverseName stack = new ReverseName(name.length());

      
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }

        System.out.print("Reversed Name: ");
     
        while (stack.top != -1) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}

//package PacJava;
//import java.util.Scanner;
//class ReverseName {
//
//	int top;
//	char arr[];
//	ReverseName(char size){
//		arr = new char[size];
//		top = -1;
//	}
//	
//	void push(char d) {
//		if(top == arr.length-1) {
//			System.out.println("Stack overflow");
//		}else {
//			top++;
//			arr[top] = d ;
//		}
//	}
//	
//	void pop() {
//		if (top == -1) {
//			System.out.println("Stack Underflow");
//		}else {
//			top--;;
//		}
//	}
//	
//	void peek() {
//		if (top == -1) {
//			System.out.println(" Stack Empty");
//		}
//		else {
//			System.out.println("Peek:" +arr[top]);
//		}
//	}
//	
//	void display() {
//		for(int i = 0;i<=top;i++) {
//			System.out.println(arr[i]+" ");
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String name = sc.nextLine();
//		ReverseName c = new ReverseName(name.length)());
//		
//	}
//
//}
