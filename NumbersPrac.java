package PacJava;
import java.util.Scanner;

public class NumbersPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Palindrome
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no:");
	int n = sc.nextInt();
	
		//Palindrome
//		int rev=0;
//		while(n>0) {
//			int mod = n%10;
//			rev = (rev*10)+mod;
//			n=n/10;
//		}
//		
//		System.out.println(rev);
		
//		//Amstrong no
//		int sum=0;
//		while(n>0) {
//			int mod=n%10;
//			sum +=(mod*mod*mod);
//	        n /= 10;
//		}
//		System.out.println(sum);	
	
//	//Perfect no
//	int sum=0;
//	for(int i=1;i<n;i++) {
//		if(n%i==0) {
//			sum += i;
//		}
//	}
//	if(n==sum) {
//		System.out.println("Perfect No!!!");
//	}
	
	
	//Spy no
//	int sum=0,pro=1;
//	while(n>0) {
//		int digit = n%10;
//		sum += digit;
//		pro += digit;
//		n /= 10;
//	}if(sum==pro) {
//		System.out.println("Spy No!!");
//	}

//	//Strong no
//	int sum = 0;
//	int num = n;
//	while(n>0) {
//		int digit = n%10;
//		sum+=fact(digit);
//		n /= 10;
//	}
//	if(sum==num) {
//		System.out.println("Strong no!!");
//	}else{
//		System.out.println("not!!");
//		}
//	}
//	
//	static int fact(int n) {
//		int fact = 1;
//		for (int i =1;i<=n;i++) {
//			fact *= i;
//		}
//		return fact;
	
	//Niven no
//	int sum=0;
//	int num = n;
//	while(n>0) {
//		int digit = n%10;
//		sum += digit;
//		n /= 10;
//	}
//	if(num%sum==0) {
//		System.out.println("Niven no!!!");
//	}else {
//		System.out.println("not!!!");
//	}
	
	//Automorphic no
//	int sq = 0;
//	sq = n*n;
//	while(n>0) {
//		int digit = n%10;
//		int dig2 = sq%10;
//		if(digit != dig2) {
//			sq /= 10;
//			n /= 10;
//		}
//	}
//	if(sq == n) {
//		System.out.println("Automorphic no");
//	}
	
   //	Magic no
//	int sum = 0;
//	int num =n;
//	
//	while (n > 0 || sum > 9) {
//	    if (n == 0) {
//	        n = sum;
//	        sum = 0;
//	    }
//	    int digit = n % 10;
//	    sum += digit;
//	    n /= 10;
//	}
//
//	if (sum == 1) {
//	    System.out.println(jnum + " is a Magic Number!!!!");
//	} else {
//	    System.out.println(num + " is NOT a Magic Number!!!");
//	}
	
	//Kaprekar no
	
//	int square = n * n;
//    int temp = square;
//    int digits = 0;
//
//    int num = n;
//    while (n > 0) {
//        digits++;
//        n /= 10;
//    }
//
//    int divisor = (int) Math.pow(10, digits);
//    int rightPart = square % divisor;
//    int leftPart = square / divisor;
//
//    if (leftPart + rightPart == num) {
//        System.out.println(num + " is a Kaprekar Number!");
//    } else {
//        System.out.println(num + " is NOT a Kaprekar Number.");
//    }
	
	//Duck no
//	int num = n;
//	if (num.charAt(0) == '0') {
//	    System.out.println("Not a Duck number!!");
//	} else if (num.contains("0")) {
//	    System.out.println("Duck number!!");
//	} else {
//	    System.out.println("Not a Duck number!!");
//	}
	
	//Emirp no
	
//	 if (isPrime(n)) {
//         int rev = reverse(n);
//         if (rev != n && isPrime(rev)) {
//             System.out.println(n + " is an Emirp Number!");
//         } else {
//             System.out.println(n + " is NOT an Emirp Number.");
//         }
//     } else {
//         System.out.println(n + " is NOT an Emirp Number.");
//     }
// }
//
// static boolean isPrime(int n) {
//     if (n <= 1) return false;
//     for (int i = 2; i <= n / 2; i++) {
//         if (n % i == 0) return false;
//     }
//     return true;
// }
//
// static int reverse(int n) {
//     int rev = 0;
//     while (n > 0) {
//         rev = rev * 10 + n % 10;
//         n /= 10;
//     }
//     return rev;
//    
	
	//Disarium no
//	 int length = String.valueOf(n).length();
//
//     int temp = n;
//     int sum = 0;
//
//     while (temp > 0) {
//         int digit = temp % 10;
//         sum += Math.pow(digit, length);
//         temp /= 10;
//         length--;
//     }
//
//     if (sum == n) {
//         System.out.println(n + " is a Disarium Number!");
//     } else {
//         System.out.println(n + " is NOT a Disarium Number.");
//     }
	
	//Healthy or deficient
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum += i;
		}
	}
	if(sum < n) {
		System.out.print("Deffective!!");
	}else if(sum>n){
		System.out.print("Healthy!!");
	}else {
		System.out.print("Perfect!!");
	}
	
	
	}
}
