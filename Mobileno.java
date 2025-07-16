package PacJava;
import java.util.Scanner;

public class Mobileno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Mobile No:");
        long no = Long.parseLong(sc.nextLine());
        
        String noStr = String.valueOf(no);

        if (noStr.length() != 10) {
            System.out.println("Wrong number! Mobile number must be exactly 10 digits.");
        } else if (noStr.charAt(0) != '9' && noStr.charAt(0) != '8' && noStr.charAt(0) != '7') {
            System.out.println("Wrong number! Mobile number should start with 9, 8, or 7.");
        } else {
            System.out.println("Valid Mobile Number!!! ");
        }

        sc.close();
    }
}
