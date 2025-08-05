package PacJava;
import java.util.Scanner;

public class IsSub {
	public boolean main(String args[]) {
		
		Scanner st = new Scanner(System.in);
		System.out.print("String1:");
		String s=st.nextLine();
		System.out.print("String2:");
		String t=st.nextLine();
		
		int j=0,i=0;
		
		while(j<s.length() && i<t.length()) {
			if(s.charAt(j) == t.charAt(i)) {
				j++;
			}
			i++;
		}
		
		return j == s.length();		
	}
}
