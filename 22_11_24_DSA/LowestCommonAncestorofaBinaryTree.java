class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
           return null;
        return rec(root , p , q);
    }

    public TreeNode rec(TreeNode root , TreeNode p , TreeNode q){

        if(root==null || root==p || root==q)
           return root;
        
        TreeNode l = rec(root.left , p , q);
        TreeNode r = rec(root.right , p ,q);

        if(l == null)
           return r;
        else if(r == null)
           return l;
        else{
            return root;
        }

    }
}
