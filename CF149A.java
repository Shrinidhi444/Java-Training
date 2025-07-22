package PacJava;
import java.util.Arrays;
import java.util.Scanner;

public class CF149A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int k=sc.nextInt();	
	    sc.nextLine();
		int[] arr = new int[12];
		
		String[] arr1 = sc.nextLine().split(" ");
		int i = 0 ;
		for(String a:arr1) {
			arr[i]=Integer.parseInt(a);
			i++;
		}
		Arrays.sort(arr);
		int count = 0,sum=0;
		for(i =11;i>=0;i--) {
		 sum+=arr[i];
		 count++;
		 if(sum>=k) {
			 break;
		 }
		}
		if(sum>=k) {
			System.out.print(count);
		}else {
			System.out.println(-1);
		}
	}

}
