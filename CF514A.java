package PacJava;
import java.util.Scanner;

public class CF514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            int digit = ch - '0';
            int inverted = 9 - digit;
            
            if (i == 0 && digit == 9) {
                result.append('9');
            } else {
                result.append((char)(Math.min(digit, inverted) + '0'));
            }
        }
        System.out.println(result);
    }
}

  