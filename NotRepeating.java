package PacJava;

import java.util.HashMap;
import java.util.Scanner;

public class NotRepeating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println("First non-repeating element: " + arr[i]);
                found = true;
                break;
            }
        }

     
        if (!found) {
            System.out.println("-1");
        }

        sc.close();
    }
}
