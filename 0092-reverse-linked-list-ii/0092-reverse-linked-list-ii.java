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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head==null || head.next==null) return head;
        if (l==r) return head;
        ListNode temp = head;
        ListNode right = head;
        ListNode left = head;
        ListNode prev = head;
        ListNode front = head;
        for (int i =1; i<l-1;i++){
            temp = temp.next;
        }
        for(int i =1; i<r; i++){
            right = right.next;
        }
        prev = right.next;
        left = l==1?temp:temp.next;
        front  = left.next;
        if (left==head) {
            temp = right;
            head = temp;
            }
        else temp.next = right;
        while(prev!=right){
            left.next = prev;
            prev = left;
            left = front;
            if (front!=null) front = front.next;
        }
        return head;
    }
}