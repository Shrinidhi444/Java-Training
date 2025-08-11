package PacJava;
import java.util.Scanner;

public class Solution12 {
	
	public int isSort(int n,int []a) {
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of elements:");
     int n=sc.nextInt();
     System.out.print("Elements from array:");
     int []a=new int[n];
     
     for(int i=0;i<n;i++) {
    	 a[i]=sc.nextInt();
    	 
     }
     sc.close();
    Solution12 obj = new Solution12();
	System.out.println(obj.isSort(n,a));
}
}
