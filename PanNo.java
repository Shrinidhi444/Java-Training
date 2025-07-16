package PacJava;
import java.util.Scanner;

public class PanNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your PAN No:");
        String noStr = sc.nextLine(); 

        if (noStr.length() != 10) {
            System.out.println("Invalid PAN! PAN must be exactly 10 characters.");
        } else {
            String firstFive = noStr.substring(0, 5);
            String nextFour = noStr.substring(5, 9);
            char lastChar = noStr.charAt(9);

            if (!firstFive.matches("[A-Z]{5}")) {
                System.out.println("Invalid PAN! First 5 characters must be uppercase letters.");
            } else if (!nextFour.matches("[0-9]{4}")) {
                System.out.println("Invalid PAN! Next 4 characters must be digits.");
            } else if (!Character.isUpperCase(lastChar)) {
                System.out.println("Invalid PAN! Last character must be an uppercase letter.");
            } else {
                System.out.println("Valid PAN Number: ");
            }
        }
        sc.close();
    }
}
