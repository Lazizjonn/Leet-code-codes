/*
package LeetCode;

public class AddTwoNumbers2 {

}


//Definition for singly-linked list.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode correctAnswer, answer = new ListNode();
        correctAnswer = answer;
        int yigindi = 0;

        while (l1 != null || l2 != null || yigindi != 0) {

            if (l1 != null) {
                yigindi += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                yigindi += l2.val;
                l2 = l2.next;
            }

            answer.next = new ListNode(yigindi % 10);
            yigindi /= 10;
            answer = answer.next;


        }
        return correctAnswer;
    }

}
*/
