package PacJava;
import java.util.Arrays;
import java.util.Scanner;

public class CF141A {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  String guest=sc.nextLine();
	  String host = sc.nextLine();
	  String p=sc.nextLine();
	  
	  String comb = guest+host;
	  
	  char[] combarr = comb.toCharArray();
	  char[] parr=p.toCharArray();
	  
	  Arrays.sort(combarr);
	  Arrays.sort(parr);
	  
	  if(Arrays.equals(combarr, parr)) {
		  System.out.print("YES!");
	 }else {
		 System.out.print("NO!");
	 }
  }
}
