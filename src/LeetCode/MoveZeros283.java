/*
package LeetCode;

public class MoveZeros283 {
    // [0,1,0,3,12]
    // [1,3,12,0,0]
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = nums.length; i > nums.length - index; i--) {
            nums[i] = 0;
        }
    }
}
*/
