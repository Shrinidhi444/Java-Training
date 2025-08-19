package PacJava;
import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements for Array1
        System.out.print("Enter no of elements for Array1: ");
        int m = sc.nextInt();
        int num1[] = new int[m + 100]; // extra space for merge, will adjust later
        System.out.print("Enter elements for Array1:");
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }

        // Input size and elements for Array2
        System.out.print("Enter no of elements for Array2: ");
        int n = sc.nextInt();
        int num2[] = new int[n];
        System.out.print("Enter elements for Array2:");
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }

        // Merge logic
        int s1 = m - 1;
        int s2 = n - 1;
        int s = m + n - 1;

        while (s1 >= 0 && s2 >= 0) {
            if (num1[s1] > num2[s2]) {
                num1[s] = num1[s1]; // put larger at end
                s1--;
            } else {
                num1[s] = num2[s2];
                s2--;
            }
            s--;
        }

        // If any elements left in num2
        while (s2 >= 0) {
            num1[s] = num2[s2];
            s2--;
            s--;
        }

        // Print final merged array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(num1[i] + " ");
        }

        sc.close();
    }
}
