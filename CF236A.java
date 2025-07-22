package PacJava;

import java.util.Scanner;

public class CF236A {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String uname = sc.nextLine();
	   
	   int[] freq = new int[26];
	   
	   for(int i = 0;i<uname.length();i++) {
		   char c = uname.charAt(i);
		   freq[c-'a']=1;
	   }
	   
	   int dcount = 0;
	   for(int i = 0;i<26;i++) {
		   dcount += freq[i];
	   }
	   
	   if(dcount % 2 == 0) {
		   System.out.print("CHAT WITH HER!");
	   }else {
		   System.out.print("IGNORE HIM!");
	   }
	   
	   sc.close();
   }
} 
