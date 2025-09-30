package PacJava;

import java.util.Scanner;

public class MoveZ {

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
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count += 1;
			}
		}
		
		for(int i =0;i<arr.length;i++) {
		System.out.print("Arranged all Zeros at End"+ arr[i]);}

	}

}
