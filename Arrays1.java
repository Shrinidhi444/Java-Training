package PacJava;
import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter array:");
//		int n = Integer.parseInt(sc.nextLine());
//		int target ;
         
//        for(int i=0;i<arr.length;i++) {
//	        if(arr[i]+1 != arr[i+1]) {
//		        m = arr[i];
//		         arr[i]++;
//	 }
//	    System.out.println(" ");
// }
        
//        int sum=0,expsum=(n*(n+1/2));
//        for(int i=1;i<=n-1;i++) {
//        	sum += Integer.parseInt(sc.nextLine());
//        }
//        System.out.print(expsum-sum);
//        
		 
//check the elements from array and return the elements from an array
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter array size: ");
		        int n = sc.nextInt();

		        
		        int[] arr = new int[n];
		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        
//		        System.out.print("Enter target number: ");
//		        int target = sc.nextInt();
//
//		        boolean found = false;
//
//		        for (int i = 0; i < n; i++) {
//		            for (int j = i + 1; j < n; j++) {
//		                if (arr[i] + arr[j] == target) {
//		                    System.out.println("Numbers found: " + arr[i] + " and " + arr[j]);
//		                    found = true;
//		                    break;
//		                }
//		            }
//		            if (found) break;
//		        }
//
//		        if (!found) {
//		            System.out.println("No two numbers add up to the target.");
//		        }
//		        
//		        int count = 0;
//		        
//		        
//		      for(int i=0;i<n;i++) {
//		    	  for(int j=i+1;i<n;i++) {
//		    		  arr[i] = arr[j];
//		    		  count++;
//		    	  }
//		    	  System.out.println(count);
//		      }
		              boolean[] visited = new boolean[n];

		              System.out.println("Element frequencies:");
		              for (int i = 0; i < n; i++) {
		                  if (visited[i]) continue;

		                  int count = 1;
		                  for (int j = i + 1; j < n; j++) {
		                      if (arr[i] == arr[j]) {
		                          visited[j] = true;
		                          count++;
		                      }
		                  }
		                  System.out.println(arr[i] +":" + count );
		              }
		          }
		      

	}		


