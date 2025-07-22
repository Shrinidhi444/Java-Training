package PacJava;
import java.util.Scanner;

public class CF25A {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] arr = new int[n];
	 
	 
	 int evencount = 0;
	 int oddcount = 0;
	 int evenindex = -1;
	 int oddindex = -1;
	 
	 
	 for(int i = 0 ;i < n;i++) {
		 arr[i] = sc.nextInt();
		 if(arr[i]%2 == 0) {
			 evencount++;
			 evenindex = i+1;
		 }else {
			 oddcount++;
			 oddindex=i+1;
		 }
		 
		 
		 if(evencount == 1) {
			 System.out.println(evenindex);
		 }else {
			 System.out.println(oddindex);
		 }
	 }
 }
	
}
