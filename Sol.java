import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(); 
        long sum = 0;

        if (n > 0) {
            sum = n * (n + 1) / 2; 
        } else {
            for (long i = 1; i >= n; i--) {
                sum += i;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
