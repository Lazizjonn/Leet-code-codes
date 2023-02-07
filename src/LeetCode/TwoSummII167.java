/*
package LeetCode;

public class TwoSummII167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        // [-7,-1,2,7,11,15,40] target = 9;
        while (target != (numbers[start] + numbers[end])) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else start++;
        }
        return new int[]{start + 1, end + 1};
    }
}
*/
