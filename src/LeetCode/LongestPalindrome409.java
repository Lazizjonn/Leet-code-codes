/*
package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
}

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        int length = 0;

        for (int i : hashMap.values()) {
            length += (i % 2 == 0) ? i : i - 1;
        }

        return length < s.length() ? length + 1 : length;
    }
}
*/
