/*
package LeetCode;

import java.util.Arrays;

public class PermutationInString567 {
    public static void main(String[] args) {
        System.out.println(Solution.checkInclusion("ab", "qqqeicbaooo"));
    }
}

class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        // define table
        int[] arr = new int[128];

        // define pointers
        int left = 0, right = 0;

        // fill up table
        char[] s1_arr = s1.toCharArray();
        char[] s2_arr = s2.toCharArray();

        for (char cur : s1_arr) {
            arr[cur]++;
        }

        // define minLen
        int minLength = Integer.MAX_VALUE;

        //define counter
        int counter = 0;

        // check permutation
        while (right < s2_arr.length) {
            // expand window
            char currentChar = s2_arr[right];
            if (--arr[currentChar] >= 0) {
                counter++;
            }
            System.out.println("Expand : Current char =" + currentChar + " ** from qqqeicbaooo");
            System.out.println("Expand : " + "right=" + right + "; left=" + left + " counter=" + counter);

            // contract window
            while (counter == s1.length()) {
                int currentLength = right - left + 1;
                minLength = Math.min(minLength, currentLength);
                char leftChar = s2_arr[left];
                int b = ++arr[leftChar];
                System.out.println("Contract : left=" + left + " minLength = " + minLength + " leftChar=" + leftChar + " b=" + b);

                if (b > 0) {
                    counter--;
                }
                left++;
            }
            right++;
        }

        // if minLen == size of s1
        return minLength == s1.length();

    }
}
*/
