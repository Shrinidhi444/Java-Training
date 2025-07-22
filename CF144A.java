package PacJava;
import java.util.Scanner;

public class CF144A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxp = 0;
        int minp = 0;
        int max = arr[0];
        int min = arr[0];

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxp = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minp = i;
            }
        }

        int swaps = maxp + (n - 1 - minp);

        
        if (maxp > minp) {
            swaps--;
        }

        System.out.print(swaps);
    }
}

// if(max_index > min_index){
//max_index + size_of_arr-min_index-2;}
//else { 
//	max_index + size_of_arr-min_index-1;
//	
//}
