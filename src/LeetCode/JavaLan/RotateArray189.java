/*
package LeetCode;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 4);
    }

    public static void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[(k + i)% nums.length] = copy[(i)];
        }
    }
}

// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}

*/
