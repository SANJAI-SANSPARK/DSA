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
 import java.util.*;


 class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
           return res;

        q.add(root);

        while(!q.isEmpty()){
            int l = q.size();

            for(int i=0;i<l;i++){
                TreeNode tem = q.poll();
                if(i==l-1){
                    res.add(tem.val);
                }
                
                if(tem.left != null)
                   q.add(tem.left);
                if(tem.right != null)
                  q.add(tem.right);
            }
        }

        return res;
    }
}