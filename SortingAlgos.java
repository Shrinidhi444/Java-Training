package PacJava;
import java.util.Scanner;

public class SortingAlgos {
	
	static void SelectionSort(int arr[]) {
		int n=arr.length;;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println("Selection Sort Elements:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
}
	
	static void BubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Buble Sort Elements:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
	}
	
	static void InsertionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println("Insertion Sort Elements:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Enter Size of Array:");
     int n=sc.nextInt();
     
     int arr[]=new int[n];
     
     System.out.print("Enter Array Elements:");
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
     
     SelectionSort(arr);
     BubbleSort(arr);
     InsertionSort(arr);
	}

}
