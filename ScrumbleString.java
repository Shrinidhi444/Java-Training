package PacJava;

import java.util.*;

public class ScrumbleString {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() != s2.length()) return false;

        String key = s1 + "#" + s2;
        if (memo.containsKey(key)) return memo.get(key);

        // pruning: quick check if character counts differ
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (!Arrays.equals(a1, a2)) {
            memo.put(key, false);
            return false;
        }

        int n = s1.length();
        for (int i = 1; i < n; i++) {
            // case 1: no swap
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                isScramble(s1.substring(i), s2.substring(i))) {
                memo.put(key, true);
                return true;
            }

            // case 2: swap
            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
                isScramble(s1.substring(i), s2.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        ScrumbleString solver = new ScrumbleString();
        boolean result = solver.isScramble(s1, s2);

        System.out.println("Is Scramble? " + result);
    }
}
