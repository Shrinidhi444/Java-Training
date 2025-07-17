package PacJava;

class Stack1 {
	
int top ;
int arr[];

Stack1(int size){
	arr = new int[size];
	top = -1;	
}
void push(int d) {
	if(top == arr.length-1) {
		System.out.println("Stack is overflow");
	}
	else {
		top++;
		arr[top]= d;
	}
}

void pop() {
	if(top == -1) {
		System.out.println("Stack is underflow");
	}
	else {
		top--;
	}
}

void peek() {
	if(top == -1) {
		System.out.println("Stack is empty");
	}else {
		System.out.println("The Peak Element is:"+ arr[top]);
	}
}

void display()
{
	for (int i = 0;i<=top;i++) {
		System.out.println(arr[i]+" ");
}
}

	public static void main(String[] args) {
    Stack1 s = new Stack1(5);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    s.peek();
    s.display();

}

}
