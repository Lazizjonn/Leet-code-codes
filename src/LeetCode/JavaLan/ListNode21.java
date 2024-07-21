/*
package LeetCode;


public class ListNode21 {
    int val;
    ListNode21 next;

    ListNode21() {
    }

    ListNode21(int val) {
        this.val = val;
    }

    ListNode21(int val, ListNode21 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution21 {
    public ListNode21 mergeTwoLists(ListNode21 list1, ListNode21 list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode21 sortedList = new ListNode21();

        if (list1.val < list2.val) {
            sortedList.val = list1.val;
            sortedList.next = mergeTwoLists(list1.next, list2);
        } else {
            sortedList.val = list2.val;
            sortedList.next = mergeTwoLists(list1, list2.next);
        }
        return sortedList;
    }
}*/
