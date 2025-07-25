package PacJava;
import java.util.Stack;

public class MonotonicStack {
	public static void main(String args[]) {
int[] arr= {2,5,8,12,7,6,1};
int[] nge=new int[arr.length];
Stack<Integer> st = new Stack<>();
for(int i=arr.length-1;i>=0;i--) {
	while(!st.isEmpty() && st.peek()<=arr[i]) {
		st.pop();
	}
	if(st.isEmpty()) {
		nge[i]=-1;
	}
	else {
		nge[i]=st.peek();
	}
	st.push(arr[i]);
}

	for(int i=0;i<nge.length;i++) {
		System.out.print(nge[i]+" ");
	}
}
}