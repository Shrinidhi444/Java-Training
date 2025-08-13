package PacJava;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number of elements:");
		int n=sc.nextInt();	
		
		System.out.print("Enter elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int a=arr.length;
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0;i<a;i++) {
			int no=arr[i];
			
			if(no>fmax) {
				smax=fmax;
				fmax=no;
			}else if(no>smax && no != fmax) {
				smax = no;
			}
		}
		
	if(smax == Integer.MIN_VALUE) {
	System.out.print(-1);
	}else {
	System.out.print(smax); 
	}

	}

}
