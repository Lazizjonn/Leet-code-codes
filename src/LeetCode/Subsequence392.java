package LeetCode;

public class Subsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbdgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(0)) {
                s = s.substring(1);
            }
            if (s.equals("")) {
                return true;
            }
        }
        return false;
    }
}
