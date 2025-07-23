package PacJava;
import java.util.Scanner;

public class CF282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  
        int x = 0;
        for (int i = 0; i < n; i++) {
            String op = sc.nextLine();
            if (op.charAt(0)=='+' || op.charAt(op.length()-1)=='+') {
                x++;
            } else {
                x--; 
            }
        }
        System.out.println(x);
    }
}
