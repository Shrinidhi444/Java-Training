package PacJava;
import java.util.Scanner;


public class Patterne {
	
	static void NIDHI(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n/2){
					System.out.print("* ");
			}else {
			System.out.print("  ");
			}
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int  n=sc.nextInt();
		NIDHI(n);
	}

}
