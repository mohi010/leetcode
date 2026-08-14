/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;   // bcz if the 1st condition is not executed this does means that any one of q or p is null and one is having a value hence the tree is not the same as we think..
        //  now let's check for the value of both the node 
        if (q.val!=p.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}