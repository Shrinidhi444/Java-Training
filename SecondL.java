package PacJava;
import java.util.Scanner;

public class SecondL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter elements:");
		for(int i = 0 ; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > fmax) {
				smax=fmax;
				fmax=arr[i];
			}else if(arr[i] > smax & arr[i] != fmax) {
				smax = arr[i];
			} 
		}
		
			
			if(smax == Integer.MIN_VALUE) {
				System.out.print(1);
			}else {
			System.out.print(smax);}
		
		
	}
	
	
}
