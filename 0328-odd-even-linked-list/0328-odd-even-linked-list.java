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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

    //     ListNode temp = head;
    //     int cnt = 1;
    //     while (temp != null) {
    //         if (cnt % 2 == 0) {
    //             even.add(temp.val);
    //         } else {
    //             odd.add(temp.val);
    //         }
    //         temp = temp.next;
    //         cnt++;
    //     }
    //     temp = head;
    //     int i = 0;
    //     int j = 0;
    //     while (i < odd.size()) {
    //         temp.val = odd.get(i);
    //         i++;
    //         temp = temp.next;
    //     }
    //     while (j < even.size()) {
    //         temp.val = even.get(j);
    //         j++;
    //         temp = temp.next;
    //     }
    // return head;

    if (head==null || head.next==null || head.next.next==null) return head;
    ListNode  temp = head.next;
    ListNode i = head;
    ListNode j = head.next.next;
    ListNode newHead = head.next;
    int cnt = 2;
    while(j!=null){
        i.next = j;
        i = temp;
        j = j.next;
        temp = i.next;
        cnt++;
    }
    if (cnt%2!=0){
    i.next = null;
    temp.next = newHead;
    }
    else {
        i.next = newHead;
        temp.next = null;
    }
    return head;
    }
}