/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> ans = new HashMap<>();
        ListNode temp =head;
        while(temp!=null){
            if (ans.containsKey(temp)){
                ans.put(temp, ans.get(temp)+1);
            }
            else ans.put(temp, 1);
            if (ans.get(temp)>1) return temp;
            temp = temp.next;
        }
        return null;
    }
}