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
        ListNode curr = head.next;
        ListNode front  = head.next.next;
        head.next = null;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = front;
            if (front!=null) front = front.next;
        }
        return prev;
    }
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        if (head==null || head.next==null) return ;
        ListNode middle = middleNode(head);
        ListNode newHead = reverse(middle);
        ListNode dNode  = new ListNode(-1,head);
        ListNode temp= head;
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while(t1!=null || t2!=null){
            temp.next = t2;
            temp = temp.next;
            if (t2!=null) t2 = t2.next;
            temp.next = t1;
            temp = temp.next;
            if (t1!=null) t1 = t1.next;
        }
        head =dNode.next;
    }
}