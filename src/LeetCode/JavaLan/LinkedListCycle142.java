/*
package LeetCode;

public class LinkedListCycle142 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
//        listNode5.next = listNode3;
        Solution solution = new Solution();
        System.out.println(solution.detectCycle(listNode1).val);
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        } // bor yo'qligini topadi, o'sha yerda referencini qoldiradi

        if (fast == null || fast.next == null) return null; // ulanmagan bolsa qaytarvoradi;

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        } //
        return head;
    }
}*/
