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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode t=new TreeNode(val);
            return t;
        }
        TreeNode p=root;
        TreeNode q=null;
        while(p!=null){
            q=p;
            if(val>p.val){
                p=p.right;
            }
            else{
                p=p.left;
            }
        }
        TreeNode t=new TreeNode(val);
        if(val>q.val){
            q.right=t;
        }
        else{
            q.left=t;
        }
        return root;
        
    }
}