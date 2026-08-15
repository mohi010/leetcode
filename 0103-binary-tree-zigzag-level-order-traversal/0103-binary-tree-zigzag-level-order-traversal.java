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
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node =  node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root ==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));
        while(q.size()>0){
            Pair front = q.remove();
            if (ans.size()!=front.level){
                ans.add(new ArrayList<>());
            }
            ans.get(ans.size()-1).add(front.node.val);
            if (front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
            if (front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
        }
        for (int i =0; i<ans.size(); i++){
            if (i%2!=0){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}