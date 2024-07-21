/*
package LeetCode;

public class RemoveNode19 {
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

// Input: head = [1,2,3,4,5,6,7,8,9], n = 3 , counter 8
//Output:        [1,2,3,4,5,6, ,8,9]

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        if(length == n) return head.next;

        // Reach to the previous node of the last node
        temp = head;
        n = length-n-1;
        while(temp.next != null && n != 0){
            temp = temp.next;
            n--;
        }

        // remove
        if(temp.next != null)
            temp.next = temp.next.next;


        return head;
    }
}*/
