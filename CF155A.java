package PacJava;
import java.util.Scanner;

public class CF155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int[] points = new int[n];
        
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        
        int amazingCount = 0;
        int maxScore = points[0];
        int minScore = points[0];
        
        for (int i = 1; i < n; i++) {
            if (points[i] > maxScore) {
                amazingCount++;
                maxScore = points[i];
            } else if (points[i] < minScore) {
                amazingCount++;
                minScore = points[i];
            }
        }
        
        System.out.println(amazingCount);
    }
}
