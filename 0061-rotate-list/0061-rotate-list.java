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
    
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null|| head.next ==null) return head;
        int cnt  =1;
        ListNode temp = head;
        while(temp.next!=null){
            cnt++;
            temp = temp.next;
        }
        k = k%cnt;
        ListNode slow = head;
        ListNode fast = head;
        if (k==0) return head;
        for(int i =1;i <=k; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        temp.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}