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
        ListNode front = curr.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = front;
            front = front==null|| front.next==null?null:front.next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode temp = head;
        int max = 0;
        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        newHead = reverse(newHead);
        while(temp!=null){
            int sum = temp.val + newHead.val;
            max = Math.max(max, sum);
            temp = temp.next;
            newHead = newHead.next;
        }
        return max;
    }
}