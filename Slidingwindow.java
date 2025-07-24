package PacJava;
import java.util.Scanner;

public class Slidingwindow {
    static void findsubArraySum(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = 0, sum = 0;
        int length = 0, maxsum = 0;

        while (right < n) {
            sum += arr[right];

            while (left <= right && sum >= target) {
                sum -= arr[left++];
            }

            if (sum > maxsum) {
                maxsum = sum;
                length = right - left + 1;
            }

            right++;
        }

        System.out.println("Maxsum < target: " + maxsum);
        System.out.println("Length of subarray: " + length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        int target = sc.nextInt();
        findsubArraySum(arr, target);
    }
}
