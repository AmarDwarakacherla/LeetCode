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
class Solution 
{
    StringBuilder smallest = null;
    public String smallestFromLeaf(TreeNode root) 
    {
        traverse(root, "");
        return smallest.toString();
    }
    private void traverse(TreeNode root, String s)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            s += (char)(97 + root.val);
            StringBuilder str = new StringBuilder(s);
            str.reverse();
            if(smallest == null)
                smallest = str;
            else if(str.compareTo(smallest) < 0)
                smallest = str;
            else
                return;
        }
        s += (char)(97 + root.val);
        traverse(root.left, s);
        traverse(root.right, s);
    }
}