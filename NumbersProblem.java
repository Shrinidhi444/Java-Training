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
	
	static void IsPrime(int n) {
		if(n<2) {
			System.out.println(+n+"Is Not Prime");
		}else{
			boolean prime=true;
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					prime=false;
					break;
				}
			}
			if(prime=true) {
				System.out.println(+n+"Is Prime");
			}else {
				System.out.println(+n+"Is Not Prime");
			}
		}
		
	}
	
//	static void PrintS(int n) {
//		for(int i=0;i<n-1;i++) {
//			for(int j=i;j<n-1;j++) {
//				if(i==0||i==n-1||i==n/2+1/*(j==0 && j<n/2)||(j==n-1 && j>n/2)*/) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//		}
//	}
//	
	static boolean IsprimeN(int n) {
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static void NPrime(int n) {		
			for(int i=n;i>=2;i--) {
				if(IsprimeN(i)){
				System.out.print(i+" ");
			}
		}
			System.out.println();
	}
	
	static void ReverseN(int n) {
    	int rev=0,rem;
    	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
			}
		System.out.println("Reverse of Num : "+rev);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
//		System.out.print("Enter Year:");
//		int Year=sc.nextInt();
		
		PN(num);
		EO(num);
		SumofN(num);
		// LeapYear(Year);
		IsPrime(num);
		NPrime(num);
		ReverseN(num);
		PrintS(num);
	
	}

}
