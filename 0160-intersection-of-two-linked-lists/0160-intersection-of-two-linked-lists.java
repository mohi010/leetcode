/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int countNode(ListNode head){
        ListNode temp = head;
        int cnt  =0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int cntA = countNode(headA);
        int cntB= countNode(headB);
        if (cntA<cntB) return getIntersectionNode(headB, headA);
        int k = Math.abs(cntA-cntB);
        int i = 0;
        while(i<k){
            headA = headA.next;
            i++;
        }
        while(headA!=null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;

        // HashMap<ListNode, Integer> map = new HashMap<>();
        // while(headA!=null && headB!=null){
        //     if (map.containsKey(headA)) {
        //         map.put(headA, map.get(headA)+1);
        //     }
        //     else {
        //         map.put(headA, 1);
        //     }
        //     if (map.containsKey(headB)){
        //     map.put(headB, map.get(headB)+1);
        //     }
        //     else {
        //         map.put(headB, 1);
        //     }
        //     if(map.get(headA)==2) return headA;
        //     if (map.get(headB)==2) return headB;
        //     headB = headB.next;
        //     headA = headA.next;
        // }
        // while(headA!=null){
        //     if (map.containsKey(headA)) {
        //         map.put(headA, map.get(headA)+1);
        //     }
        //     else map.put(headA, 1);
        //     if (map.get(headA)==2) return headA;
        //     headA= headA.next;
        // }
        // while(headB!=null){
        //     if (map.containsKey(headB)) {
        //         map.put(headB, map.get(headB)+1);
        //     }
        //     else map.put(headB, 1);
        //     if (map.get(headB)==2) return headB;
        //     headB= headB.next;
        // }
        // return null;
    }
}