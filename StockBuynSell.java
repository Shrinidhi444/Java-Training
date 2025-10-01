package PacJava;
import java.util.Scanner;

public class StockBuynSell {
	
	
	public static int MaxPro(int[] prices) {
		int minP = prices[0], maxP = 0;
		
		for (int i = 1; i < prices.length; i++) {
			minP = Math.min(minP, prices[i]);
			maxP = Math.max(maxP, prices[i] - minP);
		}
		return maxP;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of Elements: ");
		int n = sc.nextInt();   
		
		int[] prices = new int[n];
		System.out.println("Enter stock prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		
		int result = MaxPro(prices);
		System.out.println("Maximum Profit: " + result);
		
		sc.close();
	}
}
