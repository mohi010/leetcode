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
    public void preorder(TreeNode root, int level,List<Integer> arr){
        if (root ==null) return;
        arr.set(level,root.val);
        preorder(root.left, level+1,arr);
        preorder(root.right, level+1,arr);
    }
    public int levels(TreeNode root){
        if (root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        return 1+ Math.max(leftLevels, rightLevels);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int level = levels(root);
        ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(level, 0));
        preorder(root, 0,arr);
        return arr;
    }
}