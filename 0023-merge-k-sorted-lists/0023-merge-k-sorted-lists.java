/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode mergeSort(ListNode[] lists, int cnt) {

        // no list left
        if (cnt == lists.length)
            return null;

        // only one list left
        if (cnt == lists.length - 1)
            return lists[cnt];

        ListNode mergedRemaining = mergeSort(lists, cnt + 1);

        return merge(lists[cnt], mergedRemaining);
    }
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dNode = new ListNode(-1, null);
        ListNode temp = dNode;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null)
            temp.next = l1;
        else
            temp.next = l2;
        return dNode.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        
        if (lists.length == 0)
            return null;

        return mergeSort(lists, 0);
    }
}