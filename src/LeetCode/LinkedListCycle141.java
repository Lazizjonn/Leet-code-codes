/*
package LeetCode;


public class LinkedListCycle141 {
    int val;
    LinkedListCycle141 next;

    LinkedListCycle141(int x) {
        val = x;
        next = null;
    }
}

class Solution141 {
    public boolean hasCycle(LinkedListCycle141 head) {
        LinkedListCycle141 fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;

        }
        return false;
    }
}*/
