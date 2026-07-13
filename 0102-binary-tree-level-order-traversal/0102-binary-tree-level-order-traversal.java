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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalans=new ArrayList<>();
        Queue<TreeNode> q1=new ArrayDeque<>();
        if(root==null){
            return finalans;
        }
        q1.offer(root);
        while(!q1.isEmpty()){
            int t=q1.size();
            List<Integer> l1=new ArrayList<>();
            while(t!=0){
                var it=q1.peek();
                q1.poll();
                l1.add(it.val);
                if(it.left!=null){
                    q1.offer(it.left);
                }
                if(it.right!=null){
                    q1.offer(it.right);
                }
                t--;
            }
            finalans.add(l1);
        }
        return finalans;
    }
}