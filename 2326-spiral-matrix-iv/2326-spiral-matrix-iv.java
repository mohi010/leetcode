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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans =  new int[m][n];
        int  cl = 0;
        int ch = n-1;
        int rl = 0;
        int rh = m-1;
        ListNode temp =head;
        while(cl<=ch && rl<=rh){
            for(int i = cl; i<=ch; i++){
                int x;
                if (temp!=null) x = temp.val;
                else x = -1;
                ans[rl][i] = x;
                if (x!=-1) temp = temp.next;
            }
            rl++;
            if (cl<=ch && rl<=rh){
                for(int j = rl; j<=rh; j++){
                int x;
                if (temp!=null) x = temp.val;
                else x = -1;
                ans[j][ch] = x;
                if (x!=-1) temp = temp.next;
            }
            ch--;
            }
            if (cl<=ch && rl<=rh){
                for (int k = ch; k>=cl; k-- ){
                int x;
                if (temp!=null) x = temp.val;
                else x = -1;
                ans[rh][k] = x;
                if (x!=-1) temp = temp.next;
            }
            rh--;
            }
            if (cl<=ch && rl<=rh){
                for (int l = rh; l>=rl ; l--){
                int x;
                if (temp!=null) x = temp.val;
                else x = -1;
                ans[l][cl] = x;
                if (x!=-1) temp = temp.next;
            }
            cl++;
            }
        }
        return ans;

    }
}