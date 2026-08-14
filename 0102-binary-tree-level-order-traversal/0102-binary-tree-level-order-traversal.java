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
 class Pair{
        TreeNode first;
        int second;
        Pair(TreeNode first, int second){
            this.first = first;
            this.second  = second;
        }
    }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)  return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int curr  =1;
        q.add(new Pair(root, 1));
        while(q.size()>0){
            Pair temp = q.remove();
            if (curr== temp.second){
                subAns.add(temp.first.val);
            }
            else {
                ans.add(new ArrayList<>(subAns));
                subAns.clear();
                curr = temp.second;
                subAns.add(temp.first.val);
            }
            if (temp.first.left != null) q.add(new Pair(temp.first.left,temp.second +1 ));
            if (temp.first.right != null) q.add(new Pair(temp.first.right,temp.second +1 ));
        }
        if (!subAns.isEmpty()) ans.add(subAns);
        return ans;
    }
}