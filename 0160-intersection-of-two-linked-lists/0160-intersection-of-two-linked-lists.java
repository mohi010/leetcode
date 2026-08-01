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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        while(headA!=null && headB!=null){
            if (map.containsKey(headA)) {
                map.put(headA, map.get(headA)+1);
            }
            else {
                map.put(headA, 1);
            }
            if (map.containsKey(headB)){
            map.put(headB, map.get(headB)+1);
            }
            else {
                map.put(headB, 1);
            }
            if(map.get(headA)==2) return headA;
            if (map.get(headB)==2) return headB;
            headB = headB.next;
            headA = headA.next;
        }
        while(headA!=null){
            if (map.containsKey(headA)) {
                map.put(headA, map.get(headA)+1);
            }
            else map.put(headA, 1);
            if (map.get(headA)==2) return headA;
            headA= headA.next;
        }
        while(headB!=null){
            if (map.containsKey(headB)) {
                map.put(headB, map.get(headB)+1);
            }
            else map.put(headB, 1);
            if (map.get(headB)==2) return headB;
            headB= headB.next;
        }
        return null;
    }
}