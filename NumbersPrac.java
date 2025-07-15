package PacJava;
import java.util.Scanner;

public class NumbersPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Palindrome
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		int n = sc.nextInt();
		int rev=0;
		while(n>0) {
			int mod = n%10;
			rev = (rev*10)+mod;
			n=n/10;
		}
		
		System.out.println(rev);
		
	}

}
