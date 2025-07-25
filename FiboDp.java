package PacJava;

public class FiboDp {
	
//By Recurssion
// static int fibb(int n) {
//	 if(n<=1) {
//		 return n;
//	 }
//	 return fibb(n-1)+fibb(n-2);
// }
	
	
// stactic int fibb(int n;int[] dp)	{
//	if(n<=1) {
//		return n;
//	}
//	else if(dp[n]!=-1) {
//		return dp[n];
//	}
//	return dp[n]=fibb(n-1,dp)+fibb(n-2,dp);
	

	
	public static void main(String args[]) {
		int n= 10;
//		System.out.print(fibb(n)); // recursiion
//      int[] dp= new dp[n+1];//Memorization
//		Arrays.fill(dp-1);
//		System.out.println(fibb(n,dp));
		
		
//Tabulation
//		int[] dp=new int[n+1];
//		dp[0]=0;
//		dp[1]=1;
//		for(int i=2;i<=n;i++) {
//			dp[i]=dp[i-1]+dp[i-2];
//		}
//		System.out.print(dp[n]);
		
//		Reducing Time complexity
		int p1=0;
		int p2=1;
		int sum=0;
		for(int i=2;i<=n;i++) {
			sum=p1+p2;
			p1=p2;
			p2=sum;
		}
		
		System.out.print(sum);
	}
}

