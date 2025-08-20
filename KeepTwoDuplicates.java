package PacJava;
import java.io.*;

public class KeepTwoDuplicates {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of Array: ");
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        System.out.print("Enter Elements: ");
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        if (n <= 2) {
            System.out.print("Removed Duplicates: ");
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
            return;
        }

        int k = 2; 
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[k - 2]) { 
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.print("Removed Duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
