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
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));
        while(q.size()>0){
            Pair temp = q.remove();
            if (ans.size()!=temp.second) ans.add(new ArrayList<>(List.of(temp.first.val)));
            else ans.get(ans.size()-1).add(temp.first.val);
            if (temp.first.left != null) q.add(new Pair(temp.first.left,temp.second +1 ));
            if (temp.first.right != null) q.add(new Pair(temp.first.right,temp.second +1 ));
        }
        return ans;
    }
}