/*
package LeetCode;

public class FirstBadVersion278 {
}

 The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);

public class Solution {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = -1;

        while (start < end) {
            mid = (end + start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }


}
*/
