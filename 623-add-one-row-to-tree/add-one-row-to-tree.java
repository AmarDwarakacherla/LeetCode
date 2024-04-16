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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int d=1;
        if(depth==1){
            TreeNode t=new TreeNode(val,root,null);
            return t;
        }
        func(root,d,val,depth);
        return root;
    }
    public void func(TreeNode root,int d,int val,int depth){
        if(root==null){
            return; 
        }
        else{
            if(d==depth-1){
                TreeNode t1=new TreeNode(val,root.left,null);
                TreeNode t2=new TreeNode(val,null,root.right);
                root.left=t1;
                root.right=t2;
            }
            func(root.left,d+1,val,depth);
            func(root.right,d+1,val,depth);
        }
    }
}