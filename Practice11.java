package PacJava;
import java.util.Scanner;
import java.util.*;


public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n= sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashSet<Integer> seen = new HashSet<>();
		LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
	    
		for(int i=0;i<n;i++) {
			if(seen.contains(arr[i])) {
				duplicates.add(arr[i]);
			}else {
				seen.add(arr[i]);
			}
		}
		
		for(int no:duplicates) {
			System.out.print(no+" ");
		}
		sc.close();
	}

}
