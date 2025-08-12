package PacJava;

public class KANAKA {
    public static int minCostToKeepHealthy(int N, int K, int[] arr) {
        int cost = 0;

        for (int i = 0; i < N - 1; i++) {
            int total = arr[i] + arr[i + 1];
            if (total < K) {
                int needed = K - total;
                arr[i + 1] += needed; // Add to the next day
                cost += needed;
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        int N = 3;
        int K = 5;
        int[] arr = {2, 0, 1};

        int result = minCostToKeepHealthy(N, K, arr);
        System.out.println(result); // Output: 4
    }
}
