/*
package LeetCode;

import java.util.ArrayList;

public class ReverseLinkedList206 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new ListNode(head.val);

        ListNode answer = new ListNode();
        ArrayList<Integer> array = new ArrayList<Integer>();

        do {
            head = head.next;
            array.add(head.val);

        } while (head.next != null);

        answer.val = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            ListNode listNode = new ListNode();
            listNode.val = array.get(i);
            listNode.next = answer;
            answer = listNode;
        }

        return answer;
    }
}
*/
