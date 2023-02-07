/*
package LeetCode;

public class MiddleOfTheLinkedList876 {
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        } // counted

        temp = head;

        for (int i = 1; i <= count/2; i++) {
            head = head.next;
        }

        return head;
    }
}
*/
