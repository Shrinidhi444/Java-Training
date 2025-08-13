package PacJava;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of elemnts:");
		int no=sc.nextInt();
		
		System.out.print("Enter elements:");
		int arr[]=new int[no];
		for(int i=0;i<no;i++) {
			arr[i]=sc.nextInt();
		}
		
		int n=arr.length;
		for(int i=0;i<(n/2);i++) {//go half way
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		
		System.out.print("Reversed Array is:"+Arrays.toString(arr));
	}

}
