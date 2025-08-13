package PacJava;
import java.util.Arrays;
import java.util.Scanner;

public class AppendZerotoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of elemnts:");
		int no=sc.nextInt();
		
		System.out.print("Enter elements:");
		int arr[]=new int[no];
		for(int i=0;i<no;i++) {
			arr[i]=sc.nextInt();
		}
		
		int a=arr.length;
		int count=0;
		
		for(int i=0;i<a;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count+=1;
			}
		}
		
		System.out.print("Sorted Array:"+Arrays.toString(arr));//print the arrays
	}

}
