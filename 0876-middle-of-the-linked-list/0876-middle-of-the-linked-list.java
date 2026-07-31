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
    public ListNode middleNode(ListNode head) {
        int cnt = count(head);
        if (cnt==1) return head;
        int middle = (cnt/2)+1;
        ListNode temp = head;
        int count =1;
        while(count<middle){
            temp = temp.next;
            count++;
        }
        return temp;
    }
    public static int count(ListNode head){
        int cnt = 0;
        ListNode temp = head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}