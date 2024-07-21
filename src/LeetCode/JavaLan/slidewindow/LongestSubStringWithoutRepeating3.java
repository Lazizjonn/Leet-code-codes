/*
package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating3 {
    public static void main(String[] args) {
        Solution.lengthOfLongestSubstring("abcabcbb");
    }

}

*/
/*    Given a string s, find the length of the longest substring without repeating characters.

        Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*//*


class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray(); // "abcabcbb"
        int n = chars.length;  //
        if (n < 2) return n;

        int left = 0, right = 0;
        Map<Character, Integer> hashMap = new HashMap<>();

        int maxLen = 0;

        while (right < n) {
            System.out.println("right=" + right + " chars[right] =" + chars[right] );
            hashMap.put(chars[right], hashMap.getOrDefault(chars[right], 0) + 1);

            while (hashMap.size() != right - left + 1) {
                System.out.println("left=" + left + " chars[left] =" + chars[left] );
                hashMap.put(chars[left], hashMap.get(chars[left]) - 1);
                if (hashMap.get(chars[left]) == 0) hashMap.remove(chars[left]);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
*/
