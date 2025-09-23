package PacJava;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		int sum =0;
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			System.out.print("Perfect Number:");
		}else {
			System.out.print("Not");
		}
		sc.close();
	}

}
