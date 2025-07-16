package PacJava;
import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your password:");
	  String p= sc.nextLine();
	  
	  int upper = 0,lower= 0,digit = 0,Schar = 0;
	  if(p.length()<8) {
		  System.out.println("Length of your Password atleast must be 8");
	  }else {
		  for(int i = 0;i<p.length();i++) {
			  char ch = p.charAt(i);
			  
			  if(ch>='A' && ch<='Z'){
				  upper++;
			  }else if(ch>='a' && ch<='z') {
				  lower++;
			  }else if(ch>='0' && ch<='9') {
				  digit++;
			  }else if (ch == '#') {
				  Schar++;
			  }
		  }
		  
		  if(upper == 0) {
			  System.out.println("Upper Character Missing!!!");			  
		  }else if(lower == 0) {
			  System.out.println("Lower Character Missing!!!");	
		  }else if(digit == 0) {
			  System.out.println("Digit Character Missing!!!");	
		  }else if(Schar == 0){
			  System.out.println("Special Character Missing!!!");	
		  }
		  
		  System.out.println("Password Generated!!!");
	  }
	  sc.close();
	  }
	  
  }

