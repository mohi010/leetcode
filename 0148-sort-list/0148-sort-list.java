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
    public static ListNode merge(ListNode leftHead, ListNode rightHead){
        ListNode dNode = new ListNode(-1, null);
        ListNode temp = dNode;
        ListNode t1 = leftHead;
        ListNode t2 = rightHead;
        while(t1!=null && t2!=null){
            if (t1.val<t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else {
                temp.next =t2;
                temp = t2;
                t2 = t2.next;
            }
        }
            if (t1!=null) temp.next = t1;
            else temp.next = t2;
            return dNode.next;
        }
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    

    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode middle = findMiddle(head);
        ListNode rightHead = middle.next;
        ListNode leftHead = head;
        middle.next = null;
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        return merge(leftHead, rightHead);


        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // if (head==null || head.next==null) return head;
        // ListNode temp = head;
        // while(temp!=null){
        //     pq.add(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(temp!=null){
        //     temp.val = pq.poll();
        //     temp = temp.next;
        // }
        // return head;
}
}
