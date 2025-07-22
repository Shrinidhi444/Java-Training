package PacJava;
import java.util.Scanner;

public class CF119A{
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int n = sc.nextInt();
        
        while (true) {
            int take = gcd(a, n);
            if (n < take) {
                System.out.println(1); 
                break;
            }
            n -= take;
            
            take = gcd(b, n);
            if (n < take) {
                System.out.println(0); 
                break;
            }
            n -= take;
        }
    }
}
