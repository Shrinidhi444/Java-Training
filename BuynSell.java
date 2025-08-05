package PacJava;
import java.util.Scanner;

public class BuynSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner d=new Scanner(System.in);
       System.out.print("Enter Number Elements in Array:");
       int n = d.nextInt();
       int[] arr=new int[n];
       System.out.print("Enter Elements of Array:");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=d.nextInt();
       }
       
       int minp=Integer.MAX_VALUE;
       int maxp=0;
       
       for(int p:arr) {
    	   if(p<minp) {
    		   minp=p;
    	   }
    	   int Profit=p-minp;
    	   
    	   if(Profit>maxp) {
    		   maxp=Profit;
    	   }
       }
       
       System.out.print("Max Profit:"+maxp);
	}

}
