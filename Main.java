package PacJava;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
	Scanner sc= new Scanner(System.in);
	 String input=sc.nextLine();
	 String vowels= "AEIOUaeiou";
	 StringBuilder result = new StringBuilder();
	 for (char ch : input.toCharArray()) {
		 if(vowels.indexOf(ch)==-1) {
			 result.append('.').append(Character.toLowerCase(ch));
		 }
	 }
	 System.out.println(result.toString());
	}
}

