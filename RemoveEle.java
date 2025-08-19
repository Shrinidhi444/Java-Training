package PacJava;
import java.util.*;

public class RemoveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements
        System.out.print("Enter no of elements: ");
        int m = sc.nextInt();
        int num1[] = new int[m];
        
        System.out.print("Enter elements: ");
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }
        
        // Value to remove
        System.out.print("Enter Value to be deleted: ");
        int val = sc.nextInt();
        
        // Two-pointer technique
        int k = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != val) {
                num1[k] = num1[i];
                k++;
            }
        }
        
        // Print updated array only
        System.out.print("Updated Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(num1[i] + " ");
        }

        sc.close();
    }
}
