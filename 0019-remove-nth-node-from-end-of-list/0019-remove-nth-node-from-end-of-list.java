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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = countNode(head);
        int k = cnt-n;
        if (k==0) return head.next;
        ListNode temp = head;
        int nodeCount =1;
        while(nodeCount<k){
            temp = temp.next;
            nodeCount++;
        }
        ListNode temp2 = temp.next;
        temp.next = temp.next.next;
        temp2.next = null;
        return head;

    }
    public static int countNode(ListNode head){
        int cnt= 0;
        ListNode temp = head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}