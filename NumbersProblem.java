package PacJava;

import java.util.Scanner;

public class NumbersProblem {
	
	static void PN(int n) {
		if(n<0) {
			System.out.println("Negative");
		}else if(n>0){
			System.out.println("positive");
		}else {
			System.out.println("Neither positive nor negative");
		}
	}
	
	static void EO(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		
		PN(num);
		EO(num);
	
	}

}
