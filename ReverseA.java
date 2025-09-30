package PacJava;
import java.util.Scanner;


public class ReverseA {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array:");
	int n=sc.nextInt();
	
	int[] arr = new int[n];
	System.out.print("Enter elements:");
	for(int i = 0 ; i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int m=arr.length;
	for(int i=0;i<(m/2);i++) {
		int temp = arr[i];
		arr[i]=arr[m-i-1];
		arr[m-i-1]=temp;
	}
	System.out.print("Reversed Array: ");
	
	for(int i=0;i<m;i++) {
		System.out.print(arr[i]+" ");
	}
	sc.close();
}
	}
