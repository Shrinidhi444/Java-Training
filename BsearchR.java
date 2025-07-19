package PacJava;
import java.util.Scanner;

public class BsearchR {
	    static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            } else if (target < arr[mid]) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the elements in sorted order:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int target = sc.nextInt();

	        int result = binarySearch(arr, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}
