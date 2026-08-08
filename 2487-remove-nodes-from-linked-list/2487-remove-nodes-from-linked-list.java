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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode front = null;
        while(curr!=null){
            front = curr.next;
            curr.next = prev;
            prev= curr;
            curr = front;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode newHead = reverse(head);
        ListNode temp1 = newHead;
        ListNode dNode = new ListNode(-1, temp1);
        ListNode temp = dNode;
        temp = temp.next;
        // Stack<Integer> st = new Stack<>();
        // st.push(temp1.val);
        int max = temp1.val;
        temp1 = temp1.next;
        while(temp1!=null){
            if (temp1.val>=max) {
                temp.next = temp1;
                temp = temp.next;
                }
            max = Math.max(max, temp1.val);
            temp1 = temp1.next;
        }
        temp.next = null;
        head = reverse(dNode.next);
        return head;
    }
}