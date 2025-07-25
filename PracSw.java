package PacJava;

import java.util.Scanner;

public class PracSw {
	static void Sum(int[] arr ,int target) {
		int n=arr.length,l=0,r=0,sum=0,maxsum=0,len=0;
		while(r>n) {
			sum += arr[r];
		 
		while(l <= r && sum >= target) {
			sum -= arr[l++];
		}
		if(sum>maxsum) {
			maxsum=sum;
			l=r-l+1;
		}
		r++;
		}
		System.out.print(maxsum);
		System.out.print(len);
	}
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] nums = sc.nextLine().split(" ");
	        int[] arr = new int[nums.length];

	        for (int i = 0; i < nums.length; i++) {
	            arr[i] = Integer.parseInt(nums[i]);
	        }

	        int target = sc.nextInt();
	       Sum(arr, target);
	    }
}

