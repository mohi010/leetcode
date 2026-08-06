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
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode dNode = new ListNode(-1);
        ListNode temp = dNode;
        ListNode i = head;
        ListNode j = head.next;
        boolean flag = false;
        while(j!=null){
            if (i.val == j.val){
                flag = true;
            }
            else{
                if (flag==true){
                    i=j;
                    flag = false;
                }
                else{
                    temp.next = i;
                    temp = i;
                    i = i.next;
                }
            }
            j = j.next;
        }
        if (flag == false) temp.next = i;
        else temp.next = j;
        return dNode.next;
    }
}