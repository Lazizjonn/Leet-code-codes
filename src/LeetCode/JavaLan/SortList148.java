/*
package LeetCode;

public class SortList148 {
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
 // shu masalada lekin array.sort ishlatdim chunki time exceed berdi;
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        } // counted

        temp = head;

        int[] array = new int[count]; // array created for "count" element

        count = 0; // using count second time

        while (temp != null) {
            array[count++] = temp.val;
            temp = temp.next;
        } // val s are added

        temp = head;

        quickSort(array, 0, array.length - 1);

        count = 0;
        while(temp!=null){
            temp.val=array[count++];
            temp=temp.next;
        }
        return head;
    }

    private void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);

            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, end);
        return partitionIndex;
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
*/
