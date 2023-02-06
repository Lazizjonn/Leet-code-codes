package LeetCode;


public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x += 1;
            }
        }
        return x;
    }
}