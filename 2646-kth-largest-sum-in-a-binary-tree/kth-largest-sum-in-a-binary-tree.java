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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return -1;
        List<Long> levelSums = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            long levelsum = 0;
            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                levelsum += node.val;
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            levelSums.add(levelsum);
        }
        Collections.sort(levelSums,Collections.reverseOrder());
        if(k>levelSums.size())  return -1;
        return levelSums.get(k-1);
        
    }
}