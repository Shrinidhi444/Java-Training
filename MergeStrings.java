package PacJava;
import java.util.Scanner;

public class MergeStrings {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter word1:");
		String w1=sc.nextLine();
		System.out.print("Enter word2:");
		String w2=sc.nextLine();
		
		int A=w1.length(),B=w2.length();
		int a=0,b=0;
		int word=1;
		StringBuilder s = new StringBuilder();
		
		while(a<A && b<B) {
			if(word==1) {
				s.append(w1.charAt(a++));
				word=2;
			}else {
				s.append(w2.charAt(b++));
				word=1;
			}
		}
		
		while(a<A) {
			s.append(w1.charAt(a++));
		}
		
		while(b<B) {
			s.append(w2.charAt(b++));
		}
		
		System.out.print("Merged Strings Are:"+s.toString());
	}

}
