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

	static void SumofN(int n) {
		int sum=n*(n+1)/2;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println("The Sum of "+n+" is: "+sum);		
	}
	
	static void LeapYear(int y) {
		if(y%4==0 || (y%400==0 && y%100!=0)) {
			System.out.println("Leap");
		}else {
			System.out.println("Not leap");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		System.out.print("Enter Year");
		int Year=sc.nextInt();
		
		PN(num);
		EO(num);
		SumofN(num);
		LeapYear(Year);
	
	}

}
