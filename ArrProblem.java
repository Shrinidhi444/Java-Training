package PacJava;

import java.util.HashSet;

public class ArrProblem {
	public static void main(String args[]) {
String s = " abcabcaa";
int l=0,r=0,maxlen=0,n=s.length();
HashSet<Character> set= new HashSet<>();
while(r<n) {
	if(!set.contains(s.charAt(r))) {
		set.add(s.charAt(r));
		maxlen=Math.max(maxlen, r-1+1);
		r++;
	}else {
		set.remove(s.charAt(l));
	}
}
	}
	}