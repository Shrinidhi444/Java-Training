package PacJava;
import java.util.Arrays;

	class FactorialDp {

	    // 1. Recursion
	    static int factRec(int n) {
	        if (n <= 1) return 1;
	        return n * factRec(n - 1);
	    }

	    // 2. Memoization (Top-Down DP)
	    static int factMemo(int n, int[] dp) {
	        if (n <= 1) return 1;
	        if (dp[n] != -1) return dp[n];
	        dp[n] = n * factMemo(n - 1, dp);
	        return dp[n];
	    }

	    // 3. Tabulation (Bottom-Up DP)
	    static int factTab(int n) {
	        int[] dp = new int[n + 1];
	        dp[0] = 1;  // 0! = 1
	        for (int i = 1; i <= n; i++) {
	            dp[i] = i * dp[i - 1];
	        }
	        return dp[n];
	    }

	    // 4. Space Optimized (only one variable)
	    static int factOptimized(int n) {
	        int res = 1;
	        for (int i = 2; i <= n; i++) {
	            res *= i;
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        int n = 5;

	        System.out.println("Recursive: " + factRec(n));

	        int[] dp = new int[n + 1];
	        Arrays.fill(dp, -1);
	        System.out.println("Memoization: " + factMemo(n, dp));

	        System.out.println("Tabulation: " + factTab(n));

	        System.out.println("Optimized: " + factOptimized(n));
	    }
	}

