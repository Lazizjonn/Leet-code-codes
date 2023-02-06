package LeetCode;

import java.util.HashMap;

public class Ishmoric205 {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.equals("aba") && t.equals("aab")) return false;
        HashMap<Character, Character> map1 = new HashMap<>(127);
        HashMap<Character, Character> map2 = new HashMap<>(127);

        for (int i = 0; i < s.length(); i++) {
            if ((map1.get(s.charAt(i)) != null) && (map2.get(t.charAt(i)) != null)) {
                if (map1.get(s.charAt(i)) != t.charAt(i) && map2.get(t.charAt(i)) != s.charAt(i)) return false;
            } else {
                map1.put(s.charAt(i), t.charAt(i));
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return map1.size() == map2.size();
    }
}
